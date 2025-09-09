import java.util.HashMap;

public class LongestSubstring {
    public static int longString(String str) {
        HashMap<Character,Integer> hm = new HashMap<>();
        int maxLength = 0;
        int left = 0;
        for (int right=0; right<str.length(); right++) {
            //(1) CHECK
            if (hm.containsKey(str.charAt(right)) && hm.get(str.charAt(right)) >= left) {
                //(2) JUMP
                left = hm.get(str.charAt(right)) + 1;
            }
            //(3) PUT
            hm.put(str.charAt(right), right);
            //(4) MAX
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String name = "pwwkew";
        System.out.println(longString(name));
    }
}