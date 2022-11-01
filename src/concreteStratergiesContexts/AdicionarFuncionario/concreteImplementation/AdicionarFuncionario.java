package concreteStratergiesContexts.AdicionarFuncionario.concreteImplementation;

import abstractClasses.Funcionario;
import entities.Estagiario;
import entities.Gerente;
import entities.Presidente;
import entities.Secretaria;
import stratergiesContexts.AddFuncionariosContext;
import interfaces.UserOption;
import services.Empresa;
import utils.UsefulMethods;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AdicionarFuncionario implements UserOption {

    List<Class> kindOfEmployees = new ArrayList<Class>();

    public static Empresa empresa = null;

    public AdicionarFuncionario(final Empresa empresa) {
        AdicionarFuncionario.empresa = empresa;

        this.kindOfEmployees.add(Estagiario.class);
        this.kindOfEmployees.add(Gerente.class);
        this.kindOfEmployees.add(Presidente.class);
        this.kindOfEmployees.add(Secretaria.class);

    }

    @Override
    public void executeOption() {
        AddFuncionariosContext funcionarioContext = new AddFuncionariosContext(this.kindOfEmployees);

        Class cargo = null;

        boolean invalidCargo = true;

        System.out.println("\nInforme os dados do funcionário abaixo\n");

        while (invalidCargo) {

            System.out.print("Cargo: ");

            Scanner cargoScan = new Scanner(System.in);

            String inputCargo = cargoScan.next();

            Class filteredCargo = this.kindOfEmployees.stream()
                    .filter(cargoName ->
                            UsefulMethods.compareString(cargoName.getSimpleName(),
                            UsefulMethods.normalizeString(inputCargo)))
                    .findAny()
                    .orElse(null);
            cargo = filteredCargo;

            invalidCargo =
                    cargo == null
                    || inputCargo.replaceAll("\\s+", "").length() == 0
                    || inputCargo == null
                    || filteredCargo == null;
        };

        funcionarioContext.setContext(cargo);

        Funcionario funcionario = funcionarioContext.cadastrarFuncionario();

        Funcionario funcionarioCadastrado = empresa.adicionarFuncionario(funcionario);

        if((Integer) funcionarioCadastrado.getID() != null){
            System.out.println("\n" + UsefulMethods.capitalize(cargo.getSimpleName()) + " cadastrado(a) com sucesso!");
        }else {
            System.out.println("\nErro ao cadastrar " + cargo + ", tente novamente.");
        }

    }

    public static boolean funcionarioAlreadyExists(int id){

        List<Funcionario> filteredFuncionario =
                AdicionarFuncionario.empresa.funcionarios.stream()
                .filter(funcionario ->  id == funcionario.getID()).toList();

        return filteredFuncionario.size() > 0;
    }
}
