
import java.util.Scanner;

class Sol {
    public static void main(String[] data) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
