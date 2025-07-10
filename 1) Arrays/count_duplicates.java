public class count_duplicates {
    public static void duplicate(int nums[]) {
        boolean visited[] = new boolean[nums.length];

        for(int i=0; i<nums.length; i++) {
            if(visited[i]) {
                continue;
            }

             int count = 1;

            for(int j =i+1; j<nums.length; j++) {
                if(nums[i] == nums[j]) {
                    count++;
                    visited[j] = true;
                }
            }
        
            if (count>1) {
                System.out.println(nums[i] + " -> " + count + " times");
            }
        }
    }

    public static void main(String[] args) {
        int nums[] = {2,4,2,5,3,6,4,4};
        duplicate(nums);
    }
}
