package UserOptionsContext;

import abstractClasses.Funcionario;
import objects.Gerente;

public class AddFuncionariosContext<T extends  Funcionario> {
    private String funcionario;

    public void setContext(String funcionario){

        this.funcionario = funcionario;
    }


    public void executeFuncionarioSignup() {


    }

}


