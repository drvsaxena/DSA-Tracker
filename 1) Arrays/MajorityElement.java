// public class MajorityElement {
//     public static int majority(int nums[]) {   
        
//         for(int i=0; i<nums.length; i++) {
            
//             int count = 0;
//             for(int j=0; j<nums.length; j++) {
//                 if (nums[i] == nums[j]) {
//                     count++;
//                 }
//             }

//             if (count > (nums.length/2)) {
//                 return nums[i];
//             }
//         }
//         return -1;
//     }

//     public static void main(String[] args) {
//         int nums[] = {3,2,3};
//         System.out.println(majority(nums));
//     }
    
// }

//USING HASHMAP
import java.util.HashMap;

public class MajorityElement {
    public static void majority(int nums[]) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        
        for (int i=0; i<nums.length; i++) {
            // if (hm.containsKey(nums[i])) {
            //     hm.put(nums[i], hm.get(nums[i]) + 1);
            // } else {
            //     hm.put(nums[i], 1);
            // }

            //INSTEAD OF WRITING FOUR LINES WE HAVE SPECIAL FUNCTION:
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
        }

        // Set<Integer> keys = hm.keySet();
        //INSTEAD OF WRITING SET SPECIALLY WE CAN DIRECTLY ITERATE IN LOOP:
        for (int i : hm.keySet()) {
            if (hm.get(i) > nums.length/3) {
                System.out.print(i);
            }
        }
    }


    public static void main(String[] args) {
        int nums[] = {1,3,2,5,1,3,1,5,1};
        majority(nums);
    }
}