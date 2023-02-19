public class stringComparison {
    public static void main(String[] args) {
        String s1 = "ritwik";
        String s2 = new String("ritwik");
        String s3 = new String("RITWIK");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s3));
    }
}
