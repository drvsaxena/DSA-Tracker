public class SquareRoot {
    public static int sqrt(int x) {
        int s = (int) Math.sqrt(x);
        /*
           We have to do type asting because sqrt function 
           only returns double value so give error of lossy coneversion.
        */

        return s;
    }
    

    public static void main(String[] args) {
        System.out.println(sqrt(25));
    }
}

/*
   We can directly use Math.sqrt(x) in Java, which gives a floating-point result.
   But if we need to implement it manually without library functions, 
   we can do it efficiently using binary search. 
   The idea is that the square root of x lies between 1 and x/2. 
   We search this range, squaring the midpoints, 
   and narrow down until we find the floor value of the square root in O(log n) time.
*/
