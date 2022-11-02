package concreteStratergiesContexts.AdicionarFuncionario.concreteImplementation;

import abstractClasses.AbstractFuncionario;
import concreteStratergiesContexts.AdicionarFuncionario.common.AddFuncionarioCommonInputs;
import entities.Secretaria;
import interfaces.CadastroFuncionarioBranch;

public class CadastrarSecretariaBranch extends AddFuncionarioCommonInputs implements CadastroFuncionarioBranch {

    @Override
    public AbstractFuncionario cadastrar() {
        this.getFuncionariosCommonData("Secretária");

        AbstractFuncionario secretaria = new Secretaria(this.ID, this.nome, this.salario);

        return secretaria;
    }
}
