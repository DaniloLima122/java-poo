package interfaces;

import abstractClasses.AbstractFuncionario;
public interface EmpresaService {
    AbstractFuncionario adicionarFuncionario(AbstractFuncionario funcionario);
    double calcularSalario (int idFuncionario);
    void aumentarAdicionalDosFuncionarios(double percentual_aumento);
    String relatorioDeFuncionarios();
}
