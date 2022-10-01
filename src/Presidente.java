import abstractClasses.Funcionario;

public class Presidente extends Funcionario {

    private double previdencia, adicional_whisky, adicional_helicoptero,
            adicional_adicional;

    public double getPrevidencia() {
        return previdencia;
    }

    public void setPrevidencia(double previdencia) {
        this.previdencia = previdencia;
    }

    public double getAdicional_whisky() {
        return adicional_whisky;
    }

    public void setAdicional_whisky(double adicional_whisky) {
        this.adicional_whisky = adicional_whisky;
    }

    public double getAdicional_helicoptero() {
        return adicional_helicoptero;
    }

    public void setAdicional_helicoptero(double adicional_helicoptero) {
        this.adicional_helicoptero = adicional_helicoptero;
    }

    public double getAdicional_adicional() {
        return adicional_adicional;
    }

    public void setAdicional_adicional(double adicional_adicional) {
        this.adicional_adicional = adicional_adicional;
    }

    public Presidente( int ID, String nome, double salario){
        super(ID, nome, salario);
        this.setPrevidencia(0.15);
        this.setAdicional_whisky(0.9);
        this.setAdicional_helicoptero(0.7);
        this.setAdicional_adicional(3.8);

    }
    void alteraAdicional(double novo_percentual){
        this.setAdicional_whisky(0.9*(1+novo_percentual));
        this.setAdicional_helicoptero(0.7*(1+novo_percentual));
        this.setAdicional_adicional(3.8*(1+novo_percentual));
    }
    public double getSalario(){
        // Calcula o salário líquido
        return(salario*((1-this.getPrevidencia())+this.getAdicional_whisky()+
                this.getAdicional_helicoptero()+this.getAdicional_adicional()));
    }
}