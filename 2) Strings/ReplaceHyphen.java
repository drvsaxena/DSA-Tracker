public class ReplaceHyphen {
    public static String repch(String str) {
        
        str = str.replaceAll("\\s", "-");

        return str;
    }

    public static void main(String[] args) {
        String str = "DSA Tracker";
        System.out.println(repch(str));
    }
}
