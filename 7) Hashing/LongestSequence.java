import java.util.HashSet;

public class LongestSequence {
    public static int longSeq(int nums[]) {
        HashSet<Integer> hs = new HashSet<>();

        int maxLength = 0;
        for (int i : nums) {
            hs.add(i);
        }

        for (int key : hs) {
            if (!hs.contains(key-1)) {
                int currentNum = key;
                int streak = 1;

                while (hs.contains(currentNum+1)) {
                    currentNum++;
                    streak++;
                }
                maxLength = Math.max(streak, maxLength);
            }
        }
        return maxLength;
    }
    

    public static void main(String[] args) {
        int nums[] = {100,4,200,1,3,2};
        System.out.println(longSeq(nums));
    }
}
