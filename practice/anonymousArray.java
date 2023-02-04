class calc {
    public int add(int nums[]) {
        int result = 0;
        for (int n : nums) {
            result = result + n;
        }
        return result;
    }
}

public class anonymousArray {
    public static void main(String[] args) {
        calc obj = new calc();
        int ans = obj.add(new int[] { 1, 2, 3, 4 });
        System.out.println(ans);
    }
}
