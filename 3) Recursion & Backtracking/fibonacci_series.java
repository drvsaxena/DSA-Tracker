import java.util.*;

public class fibonacci_series {
    //f(n) = 3
    //f(n) = f(1) + f(2) ---> f(n) = f(n-2) + f(n-1)

    public static void series(int n) { 
        int ft = 0 , st = 1;

        for(int i=0; i<n; ++i) {
            System.out.print(ft + " ");
            
            int nt = ft  + st;
            ft = st;
            st = nt; 
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number till series: ");
        int n = sc.nextInt();
        series(n);

        sc.close();
    }
}
