package interfaces;

import abstractClasses.Funcionario;

public interface IEmpresaService {
    Funcionario adicionarFuncionario(Funcionario funcionario);
    double calcularSalario (int idFuncionario);
    void aumentarAdicionalDosFuncionarios(double percentual_aumento);
    String relatorioDeFuncionarios();
}
