package ConcreteUserOptionStratergies;

import interfaces.UserOption;
import services.Empresa;

import java.util.Scanner;

public class GerarRelatorioDeFuncionarios implements UserOption {

    private final Empresa empresa;

    public GerarRelatorioDeFuncionarios(final Empresa empresa) {
        this.empresa = empresa;
    }
    @Override
    public void executeOption() {

        System.out.print("\nRelatorio de funcionários");
        System.out.print("\n-------------------\n");

        String relatorio = this.empresa.relatorioDeFuncionarios();

        System.out.println(relatorio);
    }
}
