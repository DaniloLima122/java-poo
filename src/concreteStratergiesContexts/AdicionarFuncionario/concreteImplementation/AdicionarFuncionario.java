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

    private final Empresa empresa;

    public AdicionarFuncionario(final Empresa empresa) {
        this.empresa = empresa;

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

        System.out.println("\nInforme os dados do funcionário abaixo");

        while (invalidCargo) {

            System.out.print("\nCargo: ");

            Scanner cargoScan = new Scanner(System.in);

            String inputCargo = cargoScan.next();

            String normalizedInputCargo = Normalizer.normalize(inputCargo, Normalizer.Form.NFD)
                    .replaceAll("[^\\p{ASCII}]", "").toString();

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

        empresa.adicionarFuncionario(funcionario);
    }
}
