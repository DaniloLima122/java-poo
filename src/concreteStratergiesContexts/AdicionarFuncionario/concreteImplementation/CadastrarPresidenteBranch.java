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

        if ((Integer) this.ID == null) {
            System.out.println("\nErro ao cadastrar presidente");
            return null;
        }else {
            System.out.println("\nPresidente cadastrado com sucesso");
        }

        Funcionario estagiario = new Presidente(this.ID, this.nome, this.salario);

        return estagiario;
    }
}
