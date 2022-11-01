package concreteStratergiesContexts.AdicionarFuncionario.concreteImplementation;

import abstractClasses.Funcionario;
import concreteStratergiesContexts.AdicionarFuncionario.common.AddFuncionarioCommonInputs;
import entities.Estagiario;
import entities.Secretaria;
import interfaces.CadastroFuncionarioBranch;

import java.util.Scanner;

public class CadastrarSecretariaBranch extends AddFuncionarioCommonInputs implements CadastroFuncionarioBranch {

    @Override
    public Funcionario cadastrar() {
        this.getFuncionariosCommonData("Secretária");

        Funcionario secretaria = new Secretaria(this.ID, this.nome, this.salario);

        return secretaria;
    }
}
