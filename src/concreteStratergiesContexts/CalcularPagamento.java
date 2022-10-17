package concreteStratergiesContexts;


import interfaces.UserOption;
import services.Empresa;

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

            System.out.print("\nInforme um ID de funcionário válido: ");

            Scanner userIdScanner = new Scanner(System.in);

            userID = userIdScanner.nextInt();

            salario = empresa.calcularSalario(userID);

            invalidID = userID == null || salario == -1;
        };

        System.out.print("\nSalario do funcionário com o ID " + userID + " é de R$" + salario + "\n");
    }
}

