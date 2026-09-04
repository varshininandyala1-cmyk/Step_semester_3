import java.util.Scanner;
    public class APP4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double balance = 5000;

        System.out.print("Enter deposit amount: ");
        double deposit = sc.nextDouble();
        balance += deposit;

        System.out.print("Enter withdrawal amount: ");
        double withdraw = sc.nextDouble();

        if (withdraw <= balance)
            balance -= withdraw;
        else
            System.out.println("Insufficient balance");

        System.out.println("Final Balance = Rs." + balance);
    }
}

