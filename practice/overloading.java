class calc {
    public static int add(int a, int b) {
        int ans = a + b;
        return ans;
    }

    public static int add(int a, int b, int c) {
        int ans = a + b + c;
        return ans;
    }

    public static double add(double a, double b) {
        double ans = a + b;
        return ans;
    }
}

public class overloading {
    public static void main(String[] args) {
        calc obj = new calc();
        int ans = obj.add(3, 4);
        int ans2 = obj.add(3, 4, 5);
        double ans3 = obj.add(3.3, 4.4);
        System.out.println(ans);
        System.out.println(ans2);
        System.out.println(ans3);

    }
}
