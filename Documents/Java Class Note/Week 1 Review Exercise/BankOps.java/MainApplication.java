import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create initial accounts
        System.out.print("How many number of customers do you want to input? ");
        int n = sc.nextInt();
        BankingOperations bankingOperations = new BankingOperations(n);

        // Loop runs until the user selects exit
        int ch;
        do {
            System.out.println("\n ***Banking System Application***");
            System.out.println("1. Display all account details");
            System.out.println("2. Search by Account number");
            System.out.println("3. Deposit the amount");
            System.out.println("4. Withdraw the amount");
            System.out.println("5. Exit");
            System.out.println("Enter your choice: ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    bankingOperations.displayAllAccounts();
                    break;
                case 2:
                    bankingOperations.searchAccount();
                    break;
                case 3:
                    bankingOperations.depositToAccount();
                    break;
                case 4:
                    bankingOperations.withdrawFromAccount();
                    break;
                case 5:
                    System.out.println("See you soon...");
                    break;
                default:
                    System.out.println("Invalid choice! Please select again.");
                    break;
            }
        } while (ch != 5);

        sc.close();
    }
}
