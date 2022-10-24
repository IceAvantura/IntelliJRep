import java.util.Scanner;

public class nestedLaddered {
    public static void main (String[] args) {
        System.out.println("Unesi broj godina");
        Scanner unos = new Scanner(System.in);
        int age = unos.nextInt();

        if (age > 21) {
            if (age > 55)
                System.out.println("senior citizen account");
            else if (age<55)
                System.out.println("savings account");
        } else if (age < 21)
                System.out.println("ineligible");
    }
}
