package entities;

import abstractClasses.AbstractFuncionario;

public class Estagiario extends AbstractFuncionario {
    private double vale_coxinha;

    public double getVale_coxinha() {
        return vale_coxinha;
    }
    public void setVale_coxinha(double vale_coxinha) {
        this.vale_coxinha = vale_coxinha;
    }

    public Estagiario(int ID, String nome, double salario, double vale_coxinha){
        super(ID, nome, salario);
        this.setVale_coxinha(vale_coxinha);
    }
    public double getSalario(){
        return(this.salario+this.getVale_coxinha());
    }
}