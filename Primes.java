public class Primes {
    public static void main(String[] args) {
        // Replace this statement with your code
        int num = Integer.parseInt(args[0]);

        boolean[] isPrime = new boolean[num + 1];
        for (int i = 2; i < isPrime.length; i++) isPrime[i] = true;

        int p = 2;
        while (p * p <= num) {
            if (isPrime[p]) {
                int i = p * p; 
                while (i <= num) {
                    isPrime[i] = false;
                    i += p; 
                }
            }
            p++;
        }

        int countPrimes = 0;
        System.out.println("Prime numbers up to " + num + ":");
        for (int j = 0; j < isPrime.length; j++) {
            if (isPrime[j]) {
                System.out.println(j);
                countPrimes++;
            }
        }
        double percentage = ((double) (countPrimes) / num) * 100;
        System.out.println("There are " + countPrimes + " primes between 2 and " + num + " (" +  (int) percentage + "% are primes) ");
    }

}