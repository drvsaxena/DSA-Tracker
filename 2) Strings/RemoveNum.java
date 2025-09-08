public class RemoveNum {
    public static String removeoth(String str) {
        str = str.replaceAll("[^a-zA-Z]", "");

        return str;
    }

    public static void main(String[] args) {
        String str = "hello123 wrold@1234";
        System.out.println(removeoth(str));
    }
}
