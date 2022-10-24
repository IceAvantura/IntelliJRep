import java.util.Scanner;

public class FirstClass {
    public static void main(String[] args){

        System.out.println ("Kolko imas godina");

        Scanner unos = new Scanner(System.in);
        int age = unos.nextInt();

if (age > 21)
    System.out.println("eligible");
else if  (age < 21)
    System.out.println ("ineligible");

    }
}
