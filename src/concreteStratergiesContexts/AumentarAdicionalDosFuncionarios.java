package concreteStratergiesContexts;

import concreteStratergiesContexts.AdicionarFuncionario.concreteImplementation.AdicionarFuncionario;
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

        double percentage = -1;

        boolean invalidPercentage = true;

        Scanner percentualScanner = new Scanner(System.in);

        while (invalidPercentage) {

            try {

                System.out.print("\nInforme a porcentagem de aumento (entre 0 e 1): ");

                String percentageValue = percentualScanner.next();

                percentage = Double.parseDouble(percentageValue);

                invalidPercentage = percentage < 0 || percentage > 1;

                this.empresa.aumentarAdicionalDosFuncionarios(percentage);
            }
            catch (Exception e){
                invalidPercentage = true;
            }
        };

        System.out.print("\nPercentual de aumento de " + percentage + "% aplicado para os funcionários elegíveis\n");
    }
}
