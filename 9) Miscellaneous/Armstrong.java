public class Armstrong {
    public static boolean isArmstrong(int num) {
        int count = String.valueOf(num).length();
        int org = num;
        double sum=0;

        while (num>0) {
            int single = num%10;
            double pow = Math.pow(single, count);
            sum = sum + pow;
            num = num/10;
        }

        if (sum == org) {
            return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        int num = 153;
        System.out.println(isArmstrong(num));
    }
}
