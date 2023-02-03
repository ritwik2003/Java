import java.util.Scanner;

public class complexPatterns {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number");
        int n = scan.nextInt();

        // diagonal pattern
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < n; j++) {
        // if (i == j) {
        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // reverse diagonal pattern
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < n; j++) {
        // if (i + j == n-1) {
        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // complex pattern 1
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i + j == n - 1 || i == 0 || j == 0 || i == n - 1 || j == n - 1 || i + j == (n - 1) / 2
                        || i - j == (n - 1) / 2 || j - i == (n - 1) / 2 || i + j == (n - 1) + (n - 1) / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            for (int j = 0; j < n; j++) {
                if (i + j == (n - 1) / 2 || i - j == (n - 1) / 2 || i + j == (n - 1) + (n - 1) / 2
                        || j - i == (n - 1) / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            for (int j = 0; j < n; j++) {
                if (i==0 && j<=(n-1)/2 || j==0 && i<=(n-1)/2 || i+j<=(n-1)/2 ||
                i==0 && j>=(n-1)/2 || j==n-1 && i<=(n-1)/2 || j-i>=(n-1)/2 || 
                j==0 && i>=(n-1)/2 || i==n-1 && j<=(n-1)/2 || i-j>=(n-1)/2 ||
                j==n-1 && i>=(n-1)/2 || i==n-1 && j>=(n-1)/2 || i+j>=n-1 +(n-1)/2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
