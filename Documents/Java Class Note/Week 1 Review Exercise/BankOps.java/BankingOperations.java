import java.util.Scanner;

public class BankingOperations {
    private BankDetail[] accounts;
    Scanner sc = new Scanner(System.in);

    // Constructor to initialize accounts
    public BankingOperations(int n) {
        accounts = new BankDetail[n];
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = new BankDetail();
            accounts[i].openAccount();
        }
    }

    // Display all accounts
    public void displayAllAccounts() {
        for (BankDetail account : accounts) {
            account.showAccount();
        }
    }

    // Search for an account by account number
    public void searchAccount() {
        System.out.print("Enter account no. you want to search: ");
        String ac_no = sc.next();
        boolean found = false;
        for (BankDetail account : accounts) {
            found = account.search(ac_no);
            if (found) {
                break;
            }
        }
        if (!found) {
            System.out.println("Search failed! Account doesn't exist..!!");
        }
    }

    // Deposit to an account
    public void depositToAccount() {
        System.out.print("Enter Account no. : ");
        String ac_no = sc.next();
        boolean found = false;
        for (BankDetail account : accounts) {
            found = account.search(ac_no);
            if (found) {
                account.deposit();
                break;
            }
        }
        if (!found) {
            System.out.println("Search failed! Account doesn't exist..!!");
        }
    }

    // Withdraw from an account
    public void withdrawFromAccount() {
        System.out.print("Enter Account No : ");
        String ac_no = sc.next();
        boolean found = false;
        for (BankDetail account : accounts) {
            found = account.search(ac_no);
            if (found) {
                account.withdraw();
                break;
            }
        }
        if (!found) {
            System.out.println("Search failed! Account doesn't exist..!!");
        }
    }
}
