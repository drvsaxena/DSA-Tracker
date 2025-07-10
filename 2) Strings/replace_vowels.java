public class replace_vowels {
    public static String repl(String str) {
        str = str.toLowerCase();
        StringBuilder sb = new StringBuilder();

        String newstr = str.replace('a', '$').replace('e', '$').replace('i', '$').replace('o', '$').replace('u', '$');
        sb.append(newstr);
        
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "Beautiful";
        System.out.println(repl(str));
    }
}
