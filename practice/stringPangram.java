import java.lang.reflect.Array;

public class stringPangram {
    public static void main(String[] args) {
        boolean flag = false;
        String str = "The quick brown fox jumps over lazy dog";
        str = str.replace(" ", "");
        str = str.toUpperCase();
        char ch[] = str.toCharArray();
        int arr[] = new int[26];
        for (int i = 0; i < ch.length; i++) {
            arr[ch[i] - 65]++;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {

                flag = true;
            }

        }
        if (flag == false) {

            System.out.println("it is pangram");
        } else {
            System.out.println("string is not pangram");
        }
    }
}
