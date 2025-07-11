public class factorial {
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

    public static void main(String args[]) {
        int num = 5;
        System.out.println("Factorial of " + num + " is: " + fact(num));
    }
}