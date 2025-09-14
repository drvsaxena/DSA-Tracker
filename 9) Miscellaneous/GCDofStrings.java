public class GCDofStrings {
    public static int gcd(int a, int b) {
        int min = Math.min(a, b);

        for (int i=min; i>=1; i--) {
            if ((a%i == 0) && (b%i == 0)) {
                return i;
            }
        }
        return -1;
    }

    public static String gcdOfStrings(String str1, String str2) {
        StringBuilder sb = new StringBuilder();
        int a = str1.length();    
        int b = str2.length();
        
        int GCD = gcd(a, b);

        if (!(str1+str2).equals(str2+str1)) {
            return "";
        }

        for (int i=0; i<GCD; i++) {
            char ch = str1.charAt(i);
            sb.append(ch);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String s1 = "LEET";
        String s2 = "CODE";
        System.out.println(gcdOfStrings(s1, s2));

    }
}
