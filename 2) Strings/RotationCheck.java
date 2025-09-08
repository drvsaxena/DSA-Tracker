public class RotationCheck {
    public static boolean rotation(String str1, String str2) {
        if(str1.length() != str2.length()) {
            return false;
        } 

        String temp = str1 + str1;
        return temp.contains(str2);
    }

    public static void main(String[] args) {
        String str1 = "ABCD";
        String str2 = "CDAB";
        if(rotation(str1, str2)) {
            System.out.println(str2 + " is rotaion of " + str1);
        } else {
            System.out.println(str2 + " is not rotaion of " + str1);
        }
    }
}
