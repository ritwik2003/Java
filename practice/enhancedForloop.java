public class enhancedForloop {
    public static void main(String[] args) {
        int nums[][] = {
                { 1, 2, 3, 4 },
                { 4, 5, 6, 7 },
                { 8, 9, 10, 11 }
        };
        for (int n[] : nums) {
            for (int b : n) {
                System.out.print(b + " ");
            }
            System.out.println();
        }
    }
}
