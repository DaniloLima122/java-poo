package concreteStratergiesContexts;


import interfaces.UserOption;
import services.Empresa;

import java.util.Locale;
import java.util.Scanner;

public class CalcularPagamento implements UserOption {

    private final Empresa empresa;

    public CalcularPagamento(final Empresa empresa) {
        this.empresa = empresa;
    }

    @Override
    public void executeOption() {

        boolean invalidID = true;

        Integer userID = null;

        double salario = -1.0;

        while (invalidID) {

            System.out.print("\nInforme código de um funcionário válido: ");

            Scanner userIdScanner = new Scanner(System.in);

            userID = userIdScanner.nextInt();

            salario = empresa.calcularSalario(userID);

            invalidID = userID == null || salario == -1;
        }

        String formatedSalario = String.format(Locale.GERMAN,"%,.2f", salario);

        System.out.print("\nSalario do funcionário com o ID " + userID + " é de R$" + formatedSalario + "\n");
    }
}

