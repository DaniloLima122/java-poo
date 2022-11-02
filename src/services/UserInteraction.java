package services;

import java.util.List;
import java.util.Scanner;

public class UserInteraction {

    public void startUserInteraction(List<UserAction> userActionsList, boolean restartOperation) {

        if(userActionsList.size() == 0){
            System.out.print("\nNenhuma operação disponível para execução\n");
        }else{

            do {

                int optionNumber = -1;
                boolean invalidOption = true;

                System.out.print("----------");
                System.out.print("\nBem vindo!\n\n");

                for (UserAction action : userActionsList) {
                    System.out.println((userActionsList.indexOf(action) + 1) + " - " + action.getActionDescription());
                }

                do {

                    System.out.print("\nEscolha uma das opções acima digitando o número correspondente: ");

                    Scanner optionScanner = new Scanner(System.in);

                    try {

                        String optinScanned = optionScanner.next();

                        optionNumber = Integer.parseInt(optinScanned);

                        invalidOption = optionNumber < 1 || optionNumber > userActionsList.size();

                    }
                    catch(Exception e) {
                        invalidOption = true;
                    }

                } while (invalidOption);


                userActionsList.get(optionNumber - 1).getOptionContext().executeOption();

            } while (restartOperation);
        }
    }
}
