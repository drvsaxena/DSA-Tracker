import java.util.HashMap;

public class FindDuplicate {
    public static void dupli(String str) {
        HashMap<Character,Integer> hm = new HashMap<>();
        for (char ch : str.toCharArray()) {
            hm.put(ch,hm.getOrDefault(ch, 0)+1);
        }
        System.out.println("=========== USING HASHMAP ===========");
        for (char key : hm.keySet()) {
            if (hm.get(key) > 1) {
                System.out.println(key + " -> " + hm.get(key) + " times");
            }
        }

        int freq[] = new int[256];
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(ch != ' ') {
                freq[ch]++;
            }
        }
        System.out.println();
        System.out.println("========== WITHOUT HASHMAP ==========");
        for(int i=0; i<freq.length; i++) {
            if(freq[i] > 1) {
                System.out.println((char) i + " -> " + freq[i] + " times");
            }
        }
    }

    public static void main(String[] args) {
        String str = "ashish";
        dupli(str);
    }
}
