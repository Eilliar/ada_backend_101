import java.util.Random;
import java.util.Scanner;

public class TestBank {
    public static void main(String[] args) {
        Random random = new Random();
        Bank testBank = new Bank();
        Scanner scanner = new Scanner(System.in);
        int chosenOption;
        String name = null;
        String cpf = null;
        String email = null;
        String id = null;
        double operationValue = 0;
        boolean operationStatus = false;

        do {
            System.out.println("\nMenu:");
            System.out.println("0. Create Account");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Show Balance");
            System.out.println("4. Quit");
            System.out.print("Choose an option: ");
            chosenOption = scanner.nextInt();
            scanner.nextLine(); //Clear buffer
            switch (chosenOption) {
                case 0:
                    System.out.print("Name: ");
                    name = scanner.nextLine();
                    System.out.print("CPF: ");
                    cpf = scanner.nextLine();
                    System.out.print("e-mail: ");
                    email = scanner.nextLine();
                    id = String.valueOf(random.nextInt(99999));

                    testBank.createAccount(name, cpf, email, id);
                    System.out.printf("Successfully created account %s\n", id);
                    break;
                case 1:
                    System.out.print("Account ID: ");
                    id = scanner.nextLine();
                    System.out.print("Value to deposit: ");
                    operationValue = scanner.nextDouble();
                    operationStatus = testBank.depositToAccount(id, operationValue);
                    if(operationStatus){
                        System.out.println("Deposit succeeded!");
                    }
                    else {
                        System.out.println("Deposit failed!");
                    }
                    break;
                case 2:
                    System.out.print("Account ID: ");
                    id = scanner.nextLine();
                    System.out.print("Value to withdraw: ");
                    operationValue = scanner.nextDouble();
                    operationStatus = testBank.withdrawFromAccount(id, operationValue);
                    if(operationStatus){
                        System.out.println("Withdraw succeeded!");
                    }
                    else {
                        System.out.println("Withdraw failed!");
                    }
                    break;
                case 3:
                    System.out.print("Account ID: ");
                    id = scanner.nextLine();
                    Account account = testBank.searchAccount(id);
                    if(account != null){
                        System.out.println(account.toString());
                    }
                    else {
                        System.out.println("Account not found!");
                    }
                    break;
                case 4:
                    System.out.println("Ok, bye!");
                    break;

                default:
                    System.out.println("Invalid option, try again.");
            }
        } while(chosenOption != 4);
    }
}
