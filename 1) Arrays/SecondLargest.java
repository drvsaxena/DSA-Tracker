public class SecondLargest {
    public static int seclar(int nums[]) {
        int lar = Integer.MIN_VALUE;
        int seclar = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++) {
            if(lar < nums[i]) {
                seclar = lar;
                lar = nums[i];
            } else if (nums[i] > seclar && nums[i] != lar) {
                // Update second largest only if it's not equal to the current largest
                seclar = nums[i];
            }

            if(seclar == Integer.MIN_VALUE){
                System.out.println("No second largest number");
            }
        }
        return seclar;
    }

    public static void main(String[] args) {
        int nums[] = {5,6,7,8,9};
        System.out.println("Second Largest number: " + seclar(nums));
    }
}
