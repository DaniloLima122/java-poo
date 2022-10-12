import interfaces.iEmpresaService;
import objects.Estagiario;
import services.Empresa;

import java.util.ArrayList;
import java.util.List;
public class Main {

    public static void main (String args[]){
        System.out.println("teste");
        Empresa _empresa = new Empresa();

        List _funcionarios = new ArrayList();

        Estagiario _estagiario = new Estagiario();

        _estagiario.setID(1);
        _estagiario.setNome("Luca Tomaz");
        _estagiario.setSalario(5000.00);
        _estagiario.setVale_coxinha(22);

        _funcionarios.add(_empresa.addFuncionario(_estagiario));

        _funcionarios.forEach(_funcionario -> System.out.println(_funcionario));
    }
}


