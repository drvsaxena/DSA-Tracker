import java.util.HashMap;

public class MajorityElement {
    public static void majority(int nums[]) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int i=0; i<nums.length; i++) {
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
        }
        for (int i : hm.keySet()) {
            if (hm.get(i) > nums.length/2) {
                System.out.print(i);
            }
        }
    }

    public static void main(String[] args) {
        int nums[] = {1,3,2,5,1,3,1,5,1};
        majority(nums);
    }
}