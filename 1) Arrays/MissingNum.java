public class MissingNum {
    public static int missing(int nums[], int N) {
        int expected = (N*(N+1)) / 2;
        int actual = 0;

        for(int i=0; i<nums.length; i++) {
            actual = actual + nums[i];
        }

        return expected - actual;
    }

    public static void main(String[] args) {
        int nums[] = {1,2,4,5,6};
        int N = 6;
        System.out.println("Missing Number: " + missing(nums, N));
    }
}
