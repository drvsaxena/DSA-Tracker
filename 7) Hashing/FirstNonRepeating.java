import java.util.HashMap;

public class FirstNonRepeating {
    
    public static int firstUniqChar(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();

        for (char ch : s.toCharArray()) {
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }

        int index=0;
        for (char key : hm.keySet()) {
            if (hm.get(key) != 1) {
                index++; 
            } else {
                return index;
            }
        }
    
        return -1;
    }


    public static void main(String[] args) {
        String name = "loveleetcode";
        System.out.println(firstUniqChar(name));
    }
}
    

