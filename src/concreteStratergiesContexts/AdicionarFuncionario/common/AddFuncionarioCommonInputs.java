package concreteStratergiesContexts.AdicionarFuncionario.common;

import concreteStratergiesContexts.AdicionarFuncionario.concreteImplementation.AdicionarFuncionario;

import java.util.Scanner;

public class AddFuncionarioCommonInputs extends CommonData {

    public void getFuncionariosCommonData(String cargo){
        Scanner commonDataScan = new Scanner(System.in);

        boolean invalidID = true;

        while(invalidID){

            try {
                System.out.print("Código do(a) " + cargo + ": ");

                String id = commonDataScan.next();

                this.ID = Integer.parseInt(id);

                boolean funcionarioAlearyExists = AdicionarFuncionario.funcionarioAlreadyExists((this.ID));

                if(funcionarioAlearyExists) {
                    System.out.print("\nJá existe um funcionário cadastrado com esse código, tente novamente!\n\n");
                }

                invalidID = funcionarioAlearyExists;
            }
            catch (Exception e){
                invalidID = true;
            }
        }

        boolean invalidName = true;

        while(invalidName){
            System.out.print("Nome do(a) " + cargo + ": ");

            this.nome = commonDataScan.next();

            invalidName = this.nome.replaceAll("\\s+", "").length() == 0
                    || this.nome == null;
        }

        boolean invalidSalario =  true;

        while(invalidSalario){
            System.out.print("Salario do(a) " + cargo + ": ");

            String salario = commonDataScan.next();

            try {
                this.salario = Double.parseDouble(salario);
                invalidSalario = false;
            }
            catch (Exception e){
                invalidSalario = true;
            }

            invalidSalario = (Double) this.salario == null || this.salario <= 0;
        }
    }
}
