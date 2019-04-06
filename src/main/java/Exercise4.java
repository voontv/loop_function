public class Exercise4 {

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
        int oldInteger = integer;
        int count = 0;
        StringBuilder builder = new StringBuilder();

        while(integer <= range) {
            if(isPrime(integer) && range % integer == 0) {
                count++;
                range /= integer;
                oldInteger = integer;
            } else {
                integer++;
            }

            if((oldInteger != integer && count > 0) || range < integer) {
                if(count > 1) {
                    if(range >= integer)
                    {
                        builder.append(oldInteger).append("^").append(count).append(" * ");
                    }
                    else {
                        builder.append(oldInteger).append("^").append(count);
                    }
                } else {
                    if(range >= integer)
                    {
                        builder.append(oldInteger).append(" * ");
                    }
                    else {
                        builder.append(oldInteger);
                    }
                }
                count =0;
            }
        }
        return builder;
    }
}
