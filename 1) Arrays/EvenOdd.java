public class EvenOdd{
    public static void evod(int nums[]) {
        int e = 0;
        int o = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] % 2 == 0) {
                e++;
            } else {
                o++;
            }
        }
        System.out.println("Even numbers: " + e);
        System.out.println("Odd numbers: " + o);
    }

    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,8,6};
        evod(nums);
    }
}