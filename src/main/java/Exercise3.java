public class Exercise3 {

    public boolean isPrime(int n) {

        for(int i = 2; i<= n/2; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public StringBuilder printDigitPrimeInRange(int range) {
        int integer = 2;
        StringBuilder builder = new StringBuilder();

        while(integer <= range) {
            if(isPrime(integer) && range % integer == 0) {
                if(range>integer) {
                    builder.append(integer).append(" * ");
                } else {
                    builder.append(integer);
                }
                range /= integer;
            } else {
                integer++;
            }
        }
        return builder;
    }
}
