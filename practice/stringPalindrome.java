import java.util.Scanner;

public class stringPalindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter a string : ");
        String str = scan.next();

        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        if (str.equals(rev)) {
            System.out.println(str + " is a palindrome");
        } else {
            System.out.println(str + " is not palindrome");
        }
    }
}
