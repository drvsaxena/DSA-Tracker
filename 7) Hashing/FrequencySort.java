import java.util.HashMap;

public class FrequencySort {
    public static String sortFreq(String str) {
        StringBuilder sb = new StringBuilder();
        HashMap<Character,Integer> hm = new HashMap<>();
        
        //STORE THE FREQUENCY
        for (char ch : str.toCharArray()) {
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }

        //FIND MAX FREQUENCY
        int maxFreq = 0;
        for (int val : hm.values()) {
            if (val > maxFreq) {
                maxFreq = val;
            }
        }

        //BUILD STRINGBUILDER
        StringBuilder bucket[] = new StringBuilder[maxFreq + 1];
        for (char key : hm.keySet()) {
            int freq = hm.get(key);
            if (bucket[freq] == null) {
                bucket[freq] = new StringBuilder();
            }
            bucket[freq].append(key);
        }

        // Step 4: Build result from high freq to low freq
        for (int i = maxFreq; i >= 1; i--) {
            if (bucket[i] != null) {
                for (char ch : bucket[i].toString().toCharArray()) {
                    for (int j = 0; j < i; j++) {
                        sb.append(ch);
                    }
                }
            }
        }

        return sb.toString();
    }


    public static void main(String[] args) {
        String str = "tree";
        System.out.println(sortFreq(str));
    }
    
}
