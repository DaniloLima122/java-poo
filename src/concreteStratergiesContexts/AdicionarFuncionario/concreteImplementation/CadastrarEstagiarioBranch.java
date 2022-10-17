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

        while((Double) vale_coxinha == null || vale_coxinha < 0) {
            System.out.println("Valor do vale coxinha: " + vale_coxinha);
            vale_coxinha = scannGerente.nextDouble();
        }

        if ((Integer) this.ID == null) {
            System.out.println("Erro ao cadastrar estagiário");
            return null;
        }else{
            System.out.println("Estagiário cadastrado com sucesso");
        }

        Funcionario estagiario = new Estagiario(this.ID, this.nome, this.salario, vale_coxinha);

        return estagiario;
    }
}
