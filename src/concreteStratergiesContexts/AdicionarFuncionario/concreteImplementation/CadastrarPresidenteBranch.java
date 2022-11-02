package concreteStratergiesContexts.AdicionarFuncionario.concreteImplementation;

import abstractClasses.AbstractFuncionario;
import concreteStratergiesContexts.AdicionarFuncionario.common.AddFuncionarioCommonInputs;
import entities.Presidente;
import interfaces.CadastroFuncionarioBranch;

public class CadastrarPresidenteBranch extends AddFuncionarioCommonInputs implements CadastroFuncionarioBranch {

    @Override
    public AbstractFuncionario cadastrar() {

        this.getFuncionariosCommonData("Presidente");

        AbstractFuncionario presidente = new Presidente(this.ID, this.nome, this.salario);

        return presidente;
    }
}
