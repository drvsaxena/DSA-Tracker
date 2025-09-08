public class CheckDigit {
    public static boolean isDigit(String str) {
        for(int i=0; i<str.length(); i++) {
            if(!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }

        return true;
    }

    public static boolean isDigit2(String str) {
        if(str.matches("\\d+")) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        String str = "12345";
        if (isDigit(str)) {
            System.out.println("Contains only digits");
        } else {
            System.out.println("Not contains only digits");
        }
    }
}
