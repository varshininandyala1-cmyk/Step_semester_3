
    import java.util.Scanner;

public class APP12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter employee name: ");
        String name = sc.nextLine();

        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();

        System.out.println("\n--- Employee Details ---");
        System.out.println("ID     : " + id);
        System.out.println("Name   : " + name);
        System.out.println("Salary : Rs." + salary);
    }
}

