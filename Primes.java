public class Primes {
    public static void main(String[] args) {
        // Replace this statement with your code
        int num = Integer.parseInt(args[0]);

        // if (num < 2) {
        //     return new boolean[0]; // No primes for numbers less than 2
        // }

        boolean[] isPrime = new boolean[num + 1];
        for (int i = 2; i < num; i++) isPrime[i] = true;
        int i = 2;
        while (i * i <= num) {
            if (isPrime[i]) {
                int j = i * i;
                while (j <= num) {
                    isPrime[j] = false;
                    j += i;
                }
            }
            i++;
        }

        int countPrimes = 0;
        System.out.println("Prime numbers up to " + num + ":");
        for (int p = 0; p < isPrime.length; p++) {
            if (isPrime[p]) {
                System.out.println(p);
                countPrimes++;
            }
        }
        double percentage = ((double) (countPrimes) / num) * 100;
        // System.out.println(percentage);
        System.out.println("There are " + countPrimes + " between 2 and " + num + " (" +  (int) percentage + "% are primes) ");
    }
}