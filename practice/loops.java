public class loops {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println("i in for loop is : " + i);
        }

        int j = 0;
        while (j < 5) {
            System.out.println("j in while loop is : " + j);
            j++;
        }

        int i = 0;
        do {
            System.out.println("*");
            i++;
        } while (i < 5);
    }
}
