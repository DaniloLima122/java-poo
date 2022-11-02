package concreteStratergiesContexts.AdicionarFuncionario.concreteImplementation;

import abstractClasses.AbstractFuncionario;
import concreteStratergiesContexts.AdicionarFuncionario.common.AddFuncionarioCommonInputs;
import entities.Gerente;
import interfaces.CadastroFuncionarioBranch;

import java.util.Scanner;

public class CadastrarGerenteBranch extends AddFuncionarioCommonInputs implements CadastroFuncionarioBranch {

    @Override
    public AbstractFuncionario cadastrar() {

        this.getFuncionariosCommonData("Gerente");

        Scanner scannGerente = new Scanner(System.in);

        Double adicional = null;

        boolean invalidAdicional = true;

        while(invalidAdicional) {

            try {

                System.out.print("Adicional do gerente: " );

                String adicionalGerente = scannGerente.next();

                adicional = Double.parseDouble(adicionalGerente);

                invalidAdicional = adicional == null || adicional < 0;
            }
            catch (Exception e){
                invalidAdicional = true;
            }
        }

        AbstractFuncionario gerente = new Gerente(this.ID, this.nome, this.salario, adicional);

        return gerente;
    }
}
