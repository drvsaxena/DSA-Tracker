public class ReverseString {
    public static String reverse(String str) {
        StringBuilder sb = new StringBuilder(str);
        int first = 0;
        int last = str.length() - 1;

        while(first < last) {
            char temp = sb.charAt(last);
            sb.setCharAt(last, sb.charAt(first));
            sb.setCharAt(first, temp);

            first++;
            last--;
        }
        return sb.toString();
    }

    public static String rev2(String str) {
        int first = 0;
        int last = str.length()-1;
        char ch[] = str.toCharArray(); 
        while (first<last) {
            char temp = ch[first];
            ch[first] = ch[last];
            ch[last] = temp;
            first++;
            last--;
        }
        return new String(ch);
    }

    public static void main(String[] args) {
        String str = "dhruv";
        // System.out.println(reverse(str));
        System.out.println(rev2(str));
    }
}
