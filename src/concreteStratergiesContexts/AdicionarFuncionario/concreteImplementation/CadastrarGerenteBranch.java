package concreteStratergiesContexts.AdicionarFuncionario.concreteImplementation;

import abstractClasses.Funcionario;
import concreteStratergiesContexts.AdicionarFuncionario.common.AddFuncionarioCommonInputs;
import entities.Gerente;
import interfaces.CadastroFuncionarioBranch;

import java.util.Scanner;

public class CadastrarGerenteBranch extends AddFuncionarioCommonInputs implements CadastroFuncionarioBranch {

    @Override
    public Funcionario cadastrar() {

        this.getFuncionariosCommonData("Gerente");

        Scanner scannGerente = new Scanner(System.in);

        Double adicional = null;

        while(adicional == null || adicional < 0) {
            System.out.println("Adicional do gerente: " + adicional);
            adicional = scannGerente.nextDouble();
        }

        if ((Integer) this.ID == null) {
            System.out.println("\nErro ao cadastrar gerente");
            return null;
        }else{
            System.out.println("\nGerente cadastrado com sucesso");
        }

        Funcionario gerente = new Gerente(this.ID, this.nome, this.salario, adicional);

        return gerente;
    }
}
