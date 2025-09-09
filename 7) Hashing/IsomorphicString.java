import java.util.HashMap;

public class IsomorphicString {
    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> hm = new HashMap<>();

        for (int i=0; i<s.length(); i++) {
            char ORG = s.charAt(i);
            char REP = t.charAt(i);
            if (!hm.containsKey(ORG)) {
                if (!hm.containsValue(REP)) {
                    hm.put(ORG, REP);
                } else {
                    return false;
                }
            } else {
                if (hm.get(ORG) != REP) {
                    return false;
                }
            }
        }

        return true;
    }


    public static void main(String[] args) {
        String s = "foo";
        String t = "bar";
        System.out.println(isIsomorphic(s, t));
    }
    
}
