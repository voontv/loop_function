public class Exercise18 {

    public StringBuilder printBinary(long number){
        StringBuilder builder = new StringBuilder();

        while(number>0) {
            builder.append(number % 2);
            number /= 2;
        }
        return  builder.reverse();
    }

    public long getDecimalReverse(long number) {
        StringBuilder builder = printBinary(number).reverse();
        long result = 0;

        for(int i = 1; i <= builder.length(); i++) {
            int integer = builder.charAt(i - 1) - '0';
            result += integer*Math.pow(2, builder.length() - i);
        }
        return result;
    }
}
