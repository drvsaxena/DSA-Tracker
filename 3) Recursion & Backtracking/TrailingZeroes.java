public class TrailingZeroes {
    public static long fact(int n) {
        if (n==1 || n==0) {
            return 1;
        }
        long fact = n * fact(n-1);
        return fact;
    }

    public static int trailingZeroes(int n) {
        long num = fact(n);

        int count=0;
        long z=0;
        while (num>0) {
            z = num%10;
            if (z == 0) {
                count++;
            } else {
                break;
            }
            num = num/10;
        }
        return count; 
    }

    public static void main(String[] args) {
        int n = 13;
        System.out.println(trailingZeroes(n));
    }
}
