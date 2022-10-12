package services;

import interfaces.iEmpresaService;
import objects.Estagiario;
import objects.Gerente;
import objects.Presidente;
import objects.Secretaria;

import java.util.ArrayList;
import java.util.List;

public class Empresa implements iEmpresaService {


    @Override
    public ArrayList<Presidente> addFuncionario(Presidente presidente) {

        Presidente _presidente = new Presidente();
        ArrayList<Presidente> _presidentes = new ArrayList<Presidente>();

        if (presidente != null)
            _presidente = presidente;

        _presidentes.add(_presidente);

        return _presidentes;
    }

    @Override
    public ArrayList<Gerente> addFuncionario(Gerente gerente) {

        Gerente _gerente = new Gerente();
        ArrayList<Gerente> _gerentes = new ArrayList<Gerente>();

        if (gerente != null)
            _gerente = gerente;

        _gerentes.add(_gerente);

        return _gerentes;
    }

    @Override
    public List<Estagiario> addFuncionario(Estagiario estagiario) {

        Estagiario _estagiario = new Estagiario();
        ArrayList<Estagiario> _estagiarios = new ArrayList<Estagiario>();

        if (estagiario != null)
            _estagiario = estagiario;

        _estagiarios.add(_estagiario);

        return _estagiarios;
    }

    @Override
    public ArrayList<Secretaria> addFuncionario(Secretaria secretaria) {

        Secretaria _secretaria = new Secretaria();
        ArrayList<Secretaria> _secretarias = new ArrayList<Secretaria>();

        if (secretaria != null)
            _secretaria = secretaria;

        _secretarias.add(_secretaria);

        return _secretarias;
    }

    @Override
    public void calcSalario(ArrayList arrayList, int id) {

    }

    @Override
    public void incrSalario(ArrayList<Presidente> presidentes, double acrescimo) {

    }
}
