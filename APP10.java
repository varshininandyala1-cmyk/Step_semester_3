
    import java.util.Scanner;

public class APP10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] roll = {101, 102, 103, 104};
        String[] name = {"Arun", "Bala", "Varshi", "Divya"};

        System.out.print("Enter roll number: ");
        int r = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < roll.length; i++) {
            if (roll[i] == r) {
                System.out.println("Student Name = " + name[i]);
                found = true;
                break;
            }
        }

        if (!found)
            System.out.println("Roll number not found");
    }
}

