public class CapitalizeFirst {
    public static String first(String str) {
        String words[] = str.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<words.length; i++) {
            if(words.length > 0) {
                String cap = words[i].substring(0,1).toUpperCase() 
                + words[i].substring(1).toLowerCase();
                sb.append(cap).append(" ");
            }    
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "hello world";
        System.out.println(first(str));
    }
}
