public class SieveOfEratosthenes {
    public static int checkPrime(int n) {
        boolean[] isPrime = new boolean[n+1];
        int count = 0;

        for (int i=0; i<n+1; i++) {
            isPrime[i] = true;
        }

        for (int i=2; i<n; i++) {
            if (isPrime[i]) {
                count++;
            }
            for (int j=i*2; j<n; j=j+i) {
                isPrime[j] = false;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(checkPrime(n));
    }
}
