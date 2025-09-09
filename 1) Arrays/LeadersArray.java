public class LeadersArray {
    public static void leaderArray(int nums[]) {
        for (int i=0; i<nums.length; i++) {
            boolean LEADER = true;

            for(int j=i+1; j<nums.length; j++) {
                if (nums[j] > nums[i]) {
                    LEADER = false;
                }
            }
            if (LEADER == true) {
                System.out.println(nums[i]);
            }
        }
    }

    public static void main(String[] args) {
        int nums[] = {17,5,2,16};
        leaderArray(nums);
    }
    
}
