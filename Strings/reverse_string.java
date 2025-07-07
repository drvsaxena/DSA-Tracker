public class reverse_string {
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

    public static void main(String[] args) {
        String str = "dhruv";
        System.out.println(reverse(str));
    }
}
