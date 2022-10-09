package interfaces;

import objects.Estagiario;
import objects.Gerente;
import objects.Presidente;
import objects.Secretaria;

import java.util.ArrayList;
import java.util.List;

public interface iEmpresaService {
    public ArrayList<Presidente> addFuncionario(Presidente presidente);
    public ArrayList<Gerente> addFuncionario(Gerente gerente);
    public List<Estagiario> addFuncionario(Estagiario estagiario);
    public ArrayList<Secretaria> addFuncionario(Secretaria secretaria);
    public void calcSalario (ArrayList arrayList, int id);
    public void incrSalario(ArrayList<Presidente> presidentes, double acrescimo);
}
