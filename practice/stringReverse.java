public class stringReverse {
    public static void main(String[] args) {

        // case 1
        // String s = "Ritwik Jain";
        // String rev = "";
        // for (int i = s.length() - 1; i >= 0; i--) {
        // rev = rev + s.charAt(i);
        // }
        // System.out.println("string before reversing : " + s);
        // System.out.println("string after reversing : " + rev);

        // case 2
        String s = "Ritwik Jain";
        String rev = "";
        String arr[] = s.split(" ");
        for (int i = arr.length - 1; i >= 0; i--) {
            rev = rev + arr[i] + " ";
        }
        System.out.println("string before reversing : " + s);
        System.out.println("string after reversing : " + rev);
    }
}
