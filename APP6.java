import java.util.Scanner;
    public class APP6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter product name: ");
        String name = sc.nextLine();

        System.out.print("Enter product ID: ");
        int id = sc.nextInt();

        System.out.print("Enter price: ");
        double price = sc.nextDouble();

        System.out.println("\n--- Product Details ---");
        System.out.println("Product ID   : " + id);
        System.out.println("Product Name : " + name);
        System.out.println("Price        : Rs." + price);
    }
}

