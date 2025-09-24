import java.util.HashMap;

public class FrquencyStr {
    public static void freq(String str) {
        int fr[] = new int[256];
        for(int i=0; i<str.length(); i++) {
            fr[str.charAt(i)]++;
        }

        for(int i=0; i<fr.length; i++) {
            if(fr[i] > 0) {
                System.out.println("Frquency of " + (char)(i) + " : " + fr[i]);
            }
        }
    }

    public static void freq2(String str) {
        HashMap<Character,Integer> hm = new HashMap<>();
        for (char ch : str.toCharArray()) {
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }
        for (char key : hm.keySet()) {
            System.out.println(key + " : " + hm.get(key));
        }
    }

    public static void main(String[] args) {
        String str = "ashish";
        freq(str);
        freq2(str);
    }
}
