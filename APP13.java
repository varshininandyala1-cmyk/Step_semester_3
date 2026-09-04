
    import java.util.Scanner;
public class APP13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Honda City - Rs.1500000");
        System.out.println("2. Hyundai Creta - Rs.1800000");
        System.out.println("3. Tata Nexon - Rs.1200000");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("You selected Honda City");
                System.out.println("Price = Rs.1500000");
                break;

            case 2:
                System.out.println("You selected Hyundai Creta");
                System.out.println("Price = Rs.1800000");
                break;

            case 3:
                System.out.println("You selected Tata Nexon");
                System.out.println("Price = Rs.1200000");
                break;

            default:
                System.out.println("Invalid choice");
        }
    }
}

