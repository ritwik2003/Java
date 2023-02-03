class createClass {
    int a;
    String name;

    public static void main(String[] args) {
        createClass obj1 = new createClass();
        createClass obj2 = new createClass();

        obj1.name = "ritwik";

        System.out.println(obj1.name);
        System.out.println(obj1.a);
        System.out.println(obj2.name);
        System.out.println(obj2.a);

    }
}
