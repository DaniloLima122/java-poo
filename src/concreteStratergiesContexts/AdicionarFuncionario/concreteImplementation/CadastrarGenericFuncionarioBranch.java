package concreteStratergiesContexts.AdicionarFuncionario.concreteImplementation;

import concreteStratergiesContexts.AdicionarFuncionario.common.AddFuncionarioCommonInputs;
import entities.Funcionario;
import interfaces.CadastroFuncionarioBranch;

public class CadastrarGenericFuncionarioBranch extends AddFuncionarioCommonInputs implements CadastroFuncionarioBranch {
    @Override
    public abstractClasses.Funcionario cadastrar() {
        this.getFuncionariosCommonData("Funcionário");

        abstractClasses.Funcionario funcionario = new Funcionario(this.ID, this.nome, this.salario);

        return funcionario;
    }
}
