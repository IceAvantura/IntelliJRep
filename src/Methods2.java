public class Methods2 {
    public static void main (String [] args) {

        String name1 = "Ivo";
        displayName (name1, 9);
        displayName ("Mark", 20);


    }

    public static void displayName (String name, int counter) {
        for (int i = 6; i < counter; i++) {

            System.out.println(i+ " : " + name);
        }


    }

}
