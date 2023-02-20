import java.util.Scanner;

public class assignment2 {
    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);
        // System.out.print("enter a string : ");
        // String str = scan.nextLine();
        // System.out.println("string is : " + str);

        // String s1 = "hello";
        // String s2 = "world";
        // String s3 = s1 + s2;
        // String s4 = s1.concat(s2);
        // System.out.println("s3 is : " + s3);
        // System.out.println("s4 is : " + s4);

        // String s1 = "hello";
        // System.out.println(s1.length());

        // String s1 = "ritwik";
        // String s2 = new String("ritwik");
        // String s3 = new String("RITWIK");
        // String s4 = s1;
        // System.out.println(s1 == s2);
        // System.out.println(s4 == s1);
        // System.out.println(s1.equals(s2));
        // System.out.println(s1.equalsIgnoreCase(s3));

        // String s = "refrigerator";
        // int len = s.length();
        // System.out.println("length of refrigerator is : " + len);

        // String str = "Umbrella";
        // System.out.println(str.indexOf("e"));

        String str = new String("Hello, have a good day");
        str = str.replaceAll("[BbCcDdFfGgHhJjKkLlMmNnPpQqRrSsTtVvWwXxYyZz]", "");
        System.out.println("String after removing vowel : " + str);
    }
}
