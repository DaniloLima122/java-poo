package interfaces;

import abstractClasses.Funcionario;
import objects.Presidente;

import java.util.ArrayList;

public interface IEmpresaService {
    void adicionarFuncionario(Funcionario funcionario);
    double calcularSalario (int idFuncionario);
    void aumentarAdicionalDosFuncionarios(double percentual_aumento);
    String relatorioDeFuncionarios();
}
