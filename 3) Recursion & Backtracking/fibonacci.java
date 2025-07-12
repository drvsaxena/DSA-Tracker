import java.util.*;

public class fibonacci {
    static int[] memo;
    
    public static int fib(int n) {
        
        if(n<=1) {
            return n;
        }

        if (memo[n] != -1) {
            return memo[n];
        }

        memo[n] = fib(n -1) + fib(n-2);
        return memo[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        memo = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            memo[i] = -1;
        }
        System.out.println("Fibonacci number at position: " + fib(n));
        sc.close();        
    }
}
