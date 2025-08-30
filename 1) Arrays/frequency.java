public class Frequency {
    public static void frq(int nums[]) {
        for(int i=0; i<nums.length; i++) {
            boolean alreadyCounted = false;
            for(int j=0; j<i; j++) {
                if(nums[i] == nums[j]){
                    alreadyCounted = true;
                    break;
                }
            }

            if (alreadyCounted){
                continue;
            }
            int count = 1;
            for(int j=i+1; j<nums.length; j++) {
                if(nums[i] == nums[j]) {
                    count++;
                }
            }

            System.out.println("Frequency of " + nums[i] + ": " + count);
        }
    }

    public static void main(String[] args) {
        int nums[] = {1,3,2,4,3,5,3,1};
        frq(nums);
    }
}