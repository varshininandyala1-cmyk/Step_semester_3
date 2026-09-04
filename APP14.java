
    import java.util.Scanner;
public class APP14 {
    private int accountNumber;
    private String accountHolderName;
    private double balance;

    APP14(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance = balance + amount;
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();

        System.out.print("Enter Account Holder Name: ");
        String name = sc.next();

        System.out.print("Enter Balance: ");
        double balance = sc.nextDouble();

        APP14 account = new APP14(accNo, name, balance);

        System.out.print("Enter deposit amount: ");
        double deposit = sc.nextDouble();
        account.deposit(deposit);

        System.out.print("Enter withdrawal amount: ");
        double withdraw = sc.nextDouble();
        account.withdraw(withdraw);

        account.display();
        sc.close();
    }
}

