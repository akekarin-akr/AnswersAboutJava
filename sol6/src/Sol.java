import java.util.Scanner;
class Sol {
    public static void main(String[] data) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = in.nextInt();
        for (int i = n; i > 0; i-- ) {
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
