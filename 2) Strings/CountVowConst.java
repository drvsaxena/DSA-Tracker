public class CountVowConst {
    public static void convow(String str) {
        str = str.toLowerCase();
        int c = 0;
        int v = 0; 
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                v++;
            } else {
                c++;
            }
        }

        System.out.println("No. of Consonants: " + c);
        System.out.println("No. of Vowels: " + v);
    }

    public static void main(String[] args) {
        String str = "ashish";
        convow(str);
    }
}
