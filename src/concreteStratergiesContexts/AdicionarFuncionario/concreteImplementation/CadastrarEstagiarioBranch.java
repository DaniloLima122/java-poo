package concreteStratergiesContexts.AdicionarFuncionario.concreteImplementation;

import abstractClasses.Funcionario;
import concreteStratergiesContexts.AdicionarFuncionario.common.AddFuncionarioCommonInputs;
import entities.Estagiario;
import entities.Gerente;
import interfaces.CadastroFuncionarioBranch;

import java.util.Scanner;

public class CadastrarEstagiarioBranch extends AddFuncionarioCommonInputs implements CadastroFuncionarioBranch {

    @Override
    public Funcionario cadastrar() {

        this.getFuncionariosCommonData("Estagiário");

        Scanner scannGerente = new Scanner(System.in);

        double vale_coxinha = -1;

        boolean invalid_vale_coxinha = true;

        while(invalid_vale_coxinha) {

            try {

                System.out.print("Valor do vale coxinha: " );

                String valeCoxinha = scannGerente.next();

                vale_coxinha = Double.parseDouble(valeCoxinha);

                invalid_vale_coxinha = valeCoxinha == null || vale_coxinha < 0;
            }
            catch (Exception e){
                invalid_vale_coxinha = true;
            }
        }

        Funcionario estagiario = new Estagiario(this.ID, this.nome, this.salario, vale_coxinha);

        return estagiario;
    }
}
