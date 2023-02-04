public class typeOfStrings {
    public static void main(String[] args) {
        String name = "ritwik";
        System.out.println(name);
        name.concat("jain");
        System.out.println(name);

        // we can change the string made using StringBuilder or StringBuffer
        StringBuilder name1 = new StringBuilder("ritwik");
        System.out.println(name1);
        name1.append("jain");
        System.out.println(name1);
    }
}
