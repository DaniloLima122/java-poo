package entities;

public class Funcionario extends abstractClasses.Funcionario {

    public Funcionario(int ID, String nome, double salario) {
        super(ID, nome, salario);
    }

    @Override
    public double getSalario() {
        return this.salario;
    }
}
