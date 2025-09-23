import java.util.HashMap;

public class CountDuplicates {
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

    public static void duplicate2(int nums[]) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int i : nums) {
            hm.put(i, hm.getOrDefault(i, 0) + 1);
        }
        for (int key : hm.keySet()) {
            if (hm.get(key) > 1) {
                System.out.println(key + " -> "+ hm.get(key) + " times" );
            }
        }
    }

    public static void main(String[] args) {
        int nums[] = {2,4,2,5,3,6,4,4};
        duplicate(nums);
        System.out.println();
        duplicate2(nums);
    }
}
