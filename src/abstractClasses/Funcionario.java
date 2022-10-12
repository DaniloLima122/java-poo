package abstractClasses;

public abstract class Funcionario {
    protected int ID;
    protected String nome;
    protected double salario;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Funcionario(){}
    public Funcionario(int ID, String nome, double salario) {
        this.setID(ID);
        this.setNome(nome);
        this.setSalario(salario);
    }

    protected abstract double getSalario();
}
