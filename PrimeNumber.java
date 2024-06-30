public class PrimeNumber {
        public static void main(String[] args) {
            boolean prime = isPrime(5);
            System.out.println(prime);
        }
        public static boolean isPrime(int num) {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    return false;

                }
            }
            return true;
        }
    }
