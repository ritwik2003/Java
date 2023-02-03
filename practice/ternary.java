public class ternary {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int c = 30;

        int res = (a < b) ? a : b;
        System.out.println(res);

        String result = (a < b) ? "a is less than b" : "b is less than a";
        System.out.println(result);

        int num = (a < b) ? (a < c ? a : c) : (b < c ? b : c);
        System.out.println(num);
    }
}
