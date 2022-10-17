import concreteStratergiesContexts.AdicionarFuncionario.concreteImplementation.AdicionarFuncionario;
import concreteStratergiesContexts.AumentarAdicionalDosFuncionarios;
import concreteStratergiesContexts.CalcularPagamento;
import concreteStratergiesContexts.GerarRelatorioDeFuncionarios;
import entities.Estagiario;
import entities.Gerente;
import services.UserAction;
import services.Empresa;
import services.UserInteraction;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
        Empresa _empresa = new Empresa();

        List<UserAction> userActions = new ArrayList<UserAction>();

        userActions.add(new UserAction(new AdicionarFuncionario(_empresa), "Adicionar um funcionário"));
        userActions.add(new UserAction(new CalcularPagamento(_empresa), "Calcular pagamento do funcionário"));
        userActions.add(new UserAction(new AumentarAdicionalDosFuncionarios(_empresa), "Aumentar o adicional de " +
                "todos os funcionários elegíveis"));
        userActions.add(new UserAction(new GerarRelatorioDeFuncionarios(_empresa), "Relatório dos funcionários da empresa"));

        new UserInteraction().startUserInteraction(userActions, true);
    }
}


