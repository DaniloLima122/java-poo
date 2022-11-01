package concreteStratergiesContexts.AdicionarFuncionario.concreteImplementation;

import abstractClasses.Funcionario;
import concreteStratergiesContexts.AdicionarFuncionario.common.AddFuncionarioCommonInputs;
import entities.Presidente;
import entities.Secretaria;
import interfaces.CadastroFuncionarioBranch;

public class CadastrarPresidenteBranch extends AddFuncionarioCommonInputs implements CadastroFuncionarioBranch {

    @Override
    public Funcionario cadastrar() {

        this.getFuncionariosCommonData("Presidente");

        Funcionario presidente = new Presidente(this.ID, this.nome, this.salario);

        return presidente;
    }
}
