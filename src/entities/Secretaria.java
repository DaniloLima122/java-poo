package entities;


import abstractClasses.AbstractFuncionario;

public class Secretaria extends AbstractFuncionario {
    private double previdencia;
    public double getPrevidencia() {
        return previdencia;
    }

    public void setPrevidencia(double previdencia) {
        this.previdencia = previdencia;
    }

    public Secretaria(int ID, String nome, double salario){
        super(ID, nome, salario);
        // Desconto fixo de um sistema de previdência da empresa
        this.setPrevidencia(0.05);
    }
    public double getSalario (){
        return(salario*(1-this.getPrevidencia()));
    }
}
