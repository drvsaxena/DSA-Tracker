public class remove_vowels {
    public static String vowels(String str) {
        str = str.toLowerCase();
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
                sb.append(ch);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "Beautiful Day"; //btfl dy
        System.out.println(vowels(str));
    }
}
