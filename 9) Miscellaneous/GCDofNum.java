import java.util.HashSet;

public class GCDofNum {
    public static int gcdOfNum(int a, int b) {
        int min = Math.min(a, b);

        for (int i=min; i>=1; i--) {
            if ((a%i == 0) && (b%i == 0) ) {
                return i;
            }
        }
        return -1;
    }

    public static int gcdOfNumbers(int a, int b) {
        HashSet<Integer> hs1 = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>();
        HashSet<Integer> hs3 = new HashSet<>();
        for (int i=1; i<=a; i++) {
            if (a % i == 0) {
                hs1.add(i);
            }
        }
        for (int i=1; i<=b; i++) {
            if (b % i == 0) {
                hs2.add(i);
            }
        }   
        for (int num : hs1) {
            if (hs2.contains(num)) {
                hs3.add(num);
            }
        }
        int max=0;
        for (int fin : hs3) {
            if (fin>max) {
                max = fin;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int a = 20;
        int b = 5;
        System.out.println(gcdOfNum(a, b));
        System.out.println();
        System.out.println(gcdOfNumbers(a, b));
    }
}
