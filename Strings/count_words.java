public class count_words {
    public static int words(String str) {
        str = str.trim();

        if(str.isEmpty()) {
            return 0;
        }
        
        String words[] = str.split("\\s+");

        return words.length;
    }

    public static void main(String[] args) {
        String str = "  Hello   world! This is   Java.  ";
        System.out.println("Number of words: " + words(str));
    }
}
