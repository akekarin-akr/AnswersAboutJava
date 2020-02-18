
import java.util.Scanner;

class Sol {
    public static void main(String[] data) {
        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter years: ");
            int years = in.nextInt();
            String res = "false";
            if (years % 400 == 0) {
                res = "true";
            }
            if (years % 400 != 0 && years % 100 != 0 && years % 4 == 0) {
                res = "true";
            }
            System.out.println(res);
        }
    }
}
