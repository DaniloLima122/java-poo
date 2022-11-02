package concreteStratergiesContexts.AdicionarFuncionario.concreteImplementation;

import abstractClasses.AbstractFuncionario;
import concreteStratergiesContexts.AdicionarFuncionario.common.AddFuncionarioCommonInputs;
import entities.Estagiario;
import entities.Funcionario;
import interfaces.CadastroFuncionarioBranch;

import java.util.Scanner;

public class CadastrarEstagiarioBranch extends AddFuncionarioCommonInputs implements CadastroFuncionarioBranch {

    @Override
    public AbstractFuncionario cadastrar() {

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

        AbstractFuncionario estagiario = new Estagiario(this.ID, this.nome, this.salario, vale_coxinha);

        return estagiario;
    }
}
