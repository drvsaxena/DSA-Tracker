import java.util.HashMap;

public class FirstNonRepeating {
    
    public static int firstUniqChar(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();

        for (char ch : s.toCharArray()) {
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }

        for (int i=0; i<s.length(); i++) {
            if (hm.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String name = "loveleetcode";
        System.out.println(firstUniqChar(name));
    }
}
    

