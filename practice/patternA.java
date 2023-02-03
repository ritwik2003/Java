import java.util.Scanner;

public class patternA {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter a number : ");
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i + j == (n - 1) / 2 && i <= (n - 1) / 4) || (j - i == (n - 1) / 2 && i <= (n - 1) / 4)
                        || (j == (n - 1) / 4 && i > (n - 1) / 4)
                        || (j == (((n - 1) / 4) + (n - 1) / 2) && i > (n - 1) / 4)
                        || (i == (n - 1) / 2 && j >= (n - 1) / 4 && j <= (n - 1) / 4 + (n - 2) / 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
