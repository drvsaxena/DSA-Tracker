import java.util.HashMap;

public class highest_occurence {
    // public static char occur(String str) {
    //     int freq[] = new int[256];
    //     for(int i=0; i<str.length(); i++) {
    //         freq[str.charAt(i)]++;
    //     }

    //     int max = 0;
    //     char result = ' ';
    //     for(int i=0; i<str.length(); i++) {
    //         if(freq[str.charAt(i)] > max) {
    //             max = freq[str.charAt(i)];
    //             result = str.charAt(i);
    //         }
    //     }
    //     return result;
    // }

    public static char occur(String str) {
        HashMap<Character,Integer> hm = new HashMap<>();

        for (char ch : str.toCharArray()) {
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }

        char res = ' ';
        int max = 0;
        for (char key : hm.keySet()) {
            if(hm.get(key) > max) {
                max = hm.get(key);
                res = key;
            }
        }

        System.out.println("Frequency: " + max);
        return res;
    }

    public static void main(String[] args) {
        String str = "successes";
        System.out.println("Highest Occurence: " + occur(str));
    }
}
