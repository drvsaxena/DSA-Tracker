public class toggle {
    public static String togg(String str) {
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);

            if(Character.isUpperCase(ch)) {
                sb.append(Character.toLowerCase(ch));
            } 
            else if(Character.isLowerCase(ch)) {
                sb.append(Character.toUpperCase(ch));
            } else {
                sb.append(ch);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "Java123 Is Fun!";
        System.out.println(togg(str));
    }
}
