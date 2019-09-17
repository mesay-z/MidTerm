package math.problems;

public class PrimeNumber {
     /* Find list of Prime numbers from number 2 to 1 million.
     * Try the best solution as possible.Which will take less CPU life cycle.
     * Out put number of Prime numbers on the given range.
      */
     static void printTwinPrime(int n)
     {
         boolean prime[] = new boolean[n + 1];
         for (int i = 0; i <= n; i++)
             prime[i] = true;
         for (int p = 2; p * p <= n; p++) {
             if (prime[p] == true) {
                 for (int i = p * 2; i <= n; i += p)
                     prime[i] = false;
             }
         }
         for (int i = 2; i <= n - 2; i++) {

             if (prime[i] == true &&
                     prime[i + 2] == true)
                 System.out.print(" (" + i + ", " +
                         (i + 2) + ")");
         }
     }
    public static void main(String[] args) {
        int n = 1000000;
        printTwinPrime(n);

    }

}
