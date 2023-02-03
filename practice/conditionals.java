public class conditionals {
    public static void main(String[] args) {
        // int age = 19;

        // if (age >= 18) {
        // System.out.println("You are Adult");
        // }

        // else {
        // System.out.println("You are minor");
        // }

        int age = 19;
        if (age >= 18 && age < 60) {
            System.out.println("you are a legal adult");
        } else if (age > 60) {
            System.out.println("you are a senior citizen");
        } else {
            System.out.println("you are a minor ");
        }
    }
}
