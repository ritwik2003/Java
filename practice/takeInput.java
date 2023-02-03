import java.util.Scanner;

public class takeInput {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter the age : ");

        int age = scan.nextInt();
        System.out.println("age is : " + age);

        System.out.println("enter the average : ");
        double average = scan.nextDouble();
        System.out.println("average is : " + average);

        System.out.println("enter your name : ");
        String name = scan.next();
        System.out.println("name is : " + name);
    }
}
