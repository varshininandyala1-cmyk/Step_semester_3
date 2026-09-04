    import java.util.Scanner;
    public class APP5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter car name: ");
        String name = sc.nextLine();

        System.out.print("Enter model: ");
        String model = sc.nextLine();

        System.out.print("Enter price: ");
        double price = sc.nextDouble();

        System.out.println("\n--- Car Details ---");
        System.out.println("Name  : " + name);
        System.out.println("Model : " + model);
        System.out.println("Price : Rs." + price);
    }
}

