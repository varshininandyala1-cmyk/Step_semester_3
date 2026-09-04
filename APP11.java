
    import java.util.Scanner;

public class APP11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter item price: ");
        double price = sc.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        double total = price * quantity;

        System.out.println("Total Bill = Rs." + total);

        if (total >= 1000) {
            double discount = total * 0.10;
            total -= discount;
            System.out.println("Discount = 10%");
        }

        System.out.println("Final Bill = Rs." + total);
    }
}

