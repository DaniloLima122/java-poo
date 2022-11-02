package entities;

import abstractClasses.AbstractFuncionario;

public class Funcionario extends AbstractFuncionario {
    public Funcionario(int ID, String nome, double salario) {
        super(ID, nome, salario);
    }
    @Override
    public double getSalario() {
        return this.salario;
    }
}
