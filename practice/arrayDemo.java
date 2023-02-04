public class arrayDemo {
    public static void main(String[] args) {
        // arrays with some initialised values
        // int num[] = { 1, 2, 3, 4 };

        // how to declare an array without initialisation using new
        // in this array all the elements will be initialised with 0
        // int number[] = new int[4];
        // number[0] = 5;
        // number[1] = 4;
        // number[2] = 3;
        // number[3] = 2;
        // for (int i = 0; i < 4; i++) {
        // System.out.println(num[i]);
        // }

        // 2-d array defined without initialisation
        // int nums[][] = new int[3][2];

        // nums[0][0] = 0;
        // nums[0][1] = 1;
        // nums[1][0] = 2;
        // nums[1][1] = 3;
        // nums[2][0] = 4;
        // nums[2][1] = 5;

        // array with initialised values
        // int nums[][] = { { 0, 1 }, { 2, 3 }, { 4, 5 } };
        // for (int i = 0; i < 3; i++) {
        // for (int j = 0; j < 2; j++) {
        // System.out.print(nums[i][j] + " ");
        // }
        // System.out.println();
        // }

        // jagged arrays are arrays with fixed rows but uncertain columns
        int nums[][] = {
                { 1, 2, 3, 4 },
                { 4, 5 },
                { 6, 7, 8 }
        };

        // to print jagged arrays we have to check the size of each row to print all
        // elements without getting errors
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }
}