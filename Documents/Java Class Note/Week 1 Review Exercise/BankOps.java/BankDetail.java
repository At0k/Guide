import java.util.Scanner;

public class BankDetail {
    private String accno;
    private String name;
    private String acc_type;
    private long balance;
    Scanner sc = new Scanner(System.in);

    //create an account
    public void openAccount(){
            System.out.println("Enter account number: ");
            accno = sc.next();
            System.out.println("Enter your name: ");
            name = sc.next();
            System.out.println("Enter you account type: ");
            acc_type = sc.next();
            System.out.println("Enter balance");
            balance = sc.nextLong();
    }

    public void showAccount(){
        System.out.println("Account Number: " + accno);
        System.out.println("Account holder name: " +name);
        System.out.println("Your account type: " + acc_type);
        System.out.println("Balance in your account: " + balance);
    }

    public void deposit(){
        long amount;
        System.out.println("Enter the amount for deposit");
        amount = sc.nextLong();
        balance = balance + amount;
        System.out.println("Your balance: " + balance);
    }

    public void withdraw(){
        long amount;
        System.out.println("Enter the amount for withdraw: ");
        amount = sc.nextLong();
        if (balance >= amount) {
            balance = balance - amount;
            System.out.println("The balance: " + balance);
        }else{
            System.out.println("The amount withdrawal exceeding you balance.");
        }

    }

    public boolean search(String acc_no){
        if (accno.equals(acc_no)) {
            showAccount();
            return true;
        }
        return false;
    }
}
