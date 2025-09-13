public class ValidPalindrome2 {
    public static boolean isPalindrome(String str,int first,int last) {
        while (first < last) {
            if (str.charAt(last) != str.charAt(first)) {
                return false;
            }
            first++;
            last--;
        }
        return true;        
    }

    // public static boolean isReally(String str) {
    //     StringBuilder sb = new StringBuilder(str);

    //     int index = 0;
    //     for (char ch : str.toCharArray()) {
    //         sb.deleteCharAt(index);

    //         if (isPalindrome(sb.toString())) {
    //             return true;
    //         } else {
    //             sb.insert(index, ch);
    //         }
    //         index++;
    //     }
    //     return false;
    // }

    public static boolean isReally(String str) {
        int first = 0;
        int last = str.length() - 1;
        
        while (first<last) {
            if (str.charAt(last) != str.charAt(first)) {
                return isPalindrome(str,first+1,last) || isPalindrome(str,first,last-1); 
            }
            else {
                first++;
                last--;
            }
        }
        return true;     
    }


    public static void main(String[] args) {
        String str = "SABRAS";
        System.out.println(isReally(str));
    }
}
