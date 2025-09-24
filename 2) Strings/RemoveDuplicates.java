import java.util.HashMap;

public class RemoveDuplicates {
    public static String remdup(String str) {
        StringBuilder sb = new StringBuilder(str);
        for(int i=0; i<sb.length()-1; i++) {
            for(int j=i+1; j<sb.length(); j++) {
                if(sb.charAt(i) == sb.charAt(j)) {
                    sb.deleteCharAt(j);
                    j--;
                }
            }
        }
        return sb.toString();
    }

    public static String remdup2(String str) {
        StringBuilder sb = new StringBuilder();
        boolean seen[] = new boolean[256];
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(!seen[ch]) {
                sb.append(ch);
                seen[ch] = true;
            }
        }
        return sb.toString();  
    }

    public static String dupliStr(String str) {
        StringBuilder sb = new StringBuilder();
        HashMap <Character, Integer> hm = new HashMap<>();
        for (char ch : str.toCharArray()) {
            if (!hm.containsKey(ch)) {
                sb.append(ch);
                hm.put(ch, hm.getOrDefault(ch, 0) + 1);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "ashish";
        System.out.println(remdup2(str));
    }
}


