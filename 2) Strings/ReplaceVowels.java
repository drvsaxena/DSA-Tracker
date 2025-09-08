public class ReplaceVowels {
    public static String repl(String str) {
        str = str.toLowerCase();
        // StringBuilder sb = new StringBuilder();

        String newstr = str.replace('a', '$').replace('e', '$').replace('i', '$').replace('o', '$').replace('u', '$');
        // sb.append(newstr);
        
        // return sb.toString();
        return newstr;
    }

    public static void main(String[] args) {
        String str = "Beautiful";
        System.out.println(repl(str));
    }
}
