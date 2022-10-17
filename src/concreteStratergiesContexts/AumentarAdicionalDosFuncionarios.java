package concreteStratergiesContexts;

import interfaces.UserOption;
import services.Empresa;

import java.util.Scanner;

public class AumentarAdicionalDosFuncionarios implements UserOption {

    private final Empresa empresa;

    public AumentarAdicionalDosFuncionarios(final Empresa empresa) {
        this.empresa = empresa;
    }

    @Override
    public void executeOption() {

        double percentage = 2.0;

        boolean invalidPercentage = true;

        while (invalidPercentage) {

            System.out.print("\nInforme a porcentagem de aumento (entre 0 e 1): ");

            Scanner userIdScanner = new Scanner(System.in);

            percentage = userIdScanner.nextDouble();

            invalidPercentage = percentage < 0 || percentage > 1;
        };

        System.out.print("\nPercentual de aumento de " + percentage + "% aplicado para os funcionários elegíveis");
    }
}
