public class highest_occurence {
    public static char occur(String str) {
        int freq[] = new int[256];
        for(int i=0; i<str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        int max = 0;
        char result = ' ';
        for(int i=0; i<str.length(); i++) {
            if(freq[str.charAt(i)] > max) {
                max = freq[str.charAt(i)];
                result = str.charAt(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String str = "ashish";
        System.out.println("Highest Occurence: " + occur(str));
    }
}
