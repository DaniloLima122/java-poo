package concreteStratergiesContexts.AdicionarFuncionario.common;

import java.util.Scanner;

public class AddFuncionarioCommonInputs extends CommonData {

    private boolean invalidData = true;

    public void getFuncionariosCommonData(String cargo){
        Scanner commonDataScan = new Scanner(System.in);

        boolean invalidID = true;

        while(invalidID){
            System.out.print("Código do " + cargo + ": ");

            this.ID = commonDataScan.nextInt();

            invalidID = (Integer) this.ID == null;
        }


        boolean invalidName = true;

        while(invalidName){
            System.out.print("Nome do " + cargo + ": ");

            this.nome = commonDataScan.next();

            invalidName = this.nome.replaceAll("\\s+", "").length() == 0
                    || this.nome == null;
        }

        boolean invalidSalario =  true;

        while(invalidSalario){
            System.out.print("Salario: ");

            this.salario = commonDataScan.nextDouble();

            invalidSalario = (Double) this.salario == null || salario <= 0;
        }
    }
}
