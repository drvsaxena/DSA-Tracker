import java.util.HashMap;

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

    public static void frq2(int nums[]) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int i : nums) {
            hm.put(i, hm.getOrDefault(i, 0) + 1);
        }
        for (int key : hm.keySet()) {
            System.out.println("Frequency of " + key + ": " + hm.get(key));
        }
    }

    public static void main(String[] args) {
        int nums[] = {1,3,2,4,3,5,3,1};
        frq(nums);
        System.out.println();
        frq2(nums);
    }
}