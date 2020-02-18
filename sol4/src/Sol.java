import java.util.ArrayList;
import java.util.Scanner;
class Sol {
    public static void main(String[] data) {
        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter Number: ");
            int n = in.nextInt();
            if (n <= 1) { System.out.println("No Prime"); }
            else if ( n == 2 ) { System.out.println(2); }
            else if (n > 2) {
                ArrayList<Integer> p = new ArrayList<Integer>();
                p.add(2);
                for (int i = 3; i <= n; i++) {
                    int c = 0;
                    for (int j = 2; j < i; j++) {
                        if (i % j == 0) { c++; }
                    }
                    if ( c == 0) { p.add(i); }
                }
                for (int i : p) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
        }
    }
}
