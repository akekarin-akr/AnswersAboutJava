import java.util.Scanner;
class Sol {
    public static void main(String[] data) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = in.nextInt();
        String[][] ar = new String[num][num];
        
        for (int i = 0 ; i < ar.length; i ++){
            for (int j = 0; j < ar[i].length; j++) {
                if (i >= j) { ar[i][j] = "*"; }
                else { ar[i][j] = ""; }
            }
        }
        
        
        for (int i = 0 ; i < ar.length; i ++){
            for (int j = 0; j < ar[i].length; j++) {
                System.out.print(ar[i][j]);
            }
            System.out.println();
        }
    }
}
