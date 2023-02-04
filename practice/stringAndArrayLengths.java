public class stringAndArrayLengths {
    public static void main(String[] args) {
        // int nums[] = { 1, 2, 3, 4 };
        // // length is a property of array type class which tells the total elements in
        // a array
        // System.out.println(nums.length);

        int nums[][] = {
                { 1, 2, 3, 4 },
                { 4, 5, 6, 7 },
                { 8, 9, 10, 11 }
        };
        // the following will give only 3 as the output
        System.out.println(nums.length);
        // the following will give the no. of elements in 1st row of 2d array
        System.out.println(nums[0].length);

        String names = "ritwik";
        // here length is a method of string which gives the length of string
        System.out.println(names.length());
    }
}
