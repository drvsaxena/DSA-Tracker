public class Factorial {
    public static int findFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        
        int fact = n * findFactorial(n-1);
        return fact;
    }

    public static int fact(int num) {
        int fac = 1;
        for(int i=0; i<= num; i++) {
            if(i == 0 || i == 1) {
                fac = 1;
            } else {
                fac = fac * i;
            }
        }
        return fac;

    }
    
    public static void main(String[] args) {
        int n = 5;
        System.out.println(findFactorial(n));
    }
}