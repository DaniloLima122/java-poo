import ConcreteUserOptionStratergies.AdicionarFuncionario;
import ConcreteUserOptionStratergies.AumentarAdicionalDosFuncionarios;
import ConcreteUserOptionStratergies.CalcularPagamento;
import ConcreteUserOptionStratergies.GerarRelatorioDeFuncionarios;
import objects.Estagiario;
import objects.Gerente;
import services.UserAction;
import services.Empresa;
import services.UserInteraction;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Empresa _empresa = new Empresa();

        Estagiario _estagiario = new Estagiario(1, "Luca Tomaz", 5000.00, 22);
        Gerente _gerente = new Gerente(2, "Dan Lima", 5000.00, 0.5);

        _empresa.adicionarFuncionario(_estagiario);
        _empresa.adicionarFuncionario(_gerente);

        List<UserAction> userActions = new ArrayList<UserAction>();

        userActions.add(new UserAction(new AdicionarFuncionario(_empresa), "Adicionar um funcionário"));
        userActions.add(new UserAction(new CalcularPagamento(_empresa), "Calcular pagamento do funcionário"));
        userActions.add(new UserAction(new AumentarAdicionalDosFuncionarios(_empresa), "Aumentar o adicional de " +
                "todos os funcionários elegíveis"));
        userActions.add(new UserAction(new GerarRelatorioDeFuncionarios(_empresa), "Relatório dos funcionários da empresa"));

        new UserInteraction().startUserInteraction(userActions, true);
    }
}


