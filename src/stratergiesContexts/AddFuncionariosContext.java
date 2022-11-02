package stratergiesContexts;

import abstractClasses.Funcionario;
import concreteStratergiesContexts.AdicionarFuncionario.concreteImplementation.*;
import interfaces.CadastroFuncionarioBranch;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AddFuncionariosContext {
    private Class funcionarioType;

    List<Class> kindOfEmployees = new ArrayList<Class>();
    private List<CadastroFuncionarioBranch> kindOfEmployeesRoutines = new ArrayList<CadastroFuncionarioBranch>();
    private Map<String, CadastroFuncionarioBranch> cadastroBranches = new HashMap<>();

    public AddFuncionariosContext(List<Class> kindOfEmployees){
        this.kindOfEmployees = kindOfEmployees;
        this.setEmployeesRoutines();
        this.buildEmployeesActionsHashmap();
    }

    private void setEmployeesRoutines(){

        this.kindOfEmployeesRoutines.add(new CadastrarEstagiarioBranch());
        this.kindOfEmployeesRoutines.add(new CadastrarGerenteBranch());
        this.kindOfEmployeesRoutines.add(new CadastrarPresidenteBranch());
        this.kindOfEmployeesRoutines.add(new CadastrarSecretariaBranch());
        this.kindOfEmployeesRoutines.add(new CadastrarGenericFuncionarioBranch());
    }

    private void buildEmployeesActionsHashmap(){

        for (int i = 0; i < kindOfEmployees.size(); i++) {
            this.cadastroBranches.put(kindOfEmployees.get(i).getSimpleName().toLowerCase(), kindOfEmployeesRoutines.get(i));
        }
    }

    public void setContext(Class funcionarioType){
        this.funcionarioType = funcionarioType;
    }

    public Funcionario cadastrarFuncionario() {
        String funcionarioType = this.funcionarioType.getSimpleName().toLowerCase();
        CadastroFuncionarioBranch routineForDispatch = this.cadastroBranches.get(funcionarioType);
        return routineForDispatch.cadastrar();
    }
}