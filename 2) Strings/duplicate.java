public class duplicate {
    public static void dupli(String str) {
        int freq[] = new int[256];

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(ch != ' ') {
                freq[ch]++;
            }
        }

        for(int i=0; i<freq.length; i++) {
            if(freq[i] > 1) {
                System.out.println((char) i + " -> " + freq[i] + " times");

            }
        }
    }

    public static void main(String[] args) {
        String str = "ashish";
        dupli(str);
    }
}
