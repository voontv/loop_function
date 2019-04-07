public class Exercise12 {

    public double getFactorial(int factorial) {
        double result = 1.0;
        if(factorial == 0) {
            return 1.0;
        }

        for(int integer = 1; integer <= factorial; integer++) {
            result *= integer;
        }
        return result;
    }

    public double totalFactorialInRange(int range) {
        double result = 0.0;

        for(int integer = 0; integer <= range; integer++) {
            result += getFactorial(integer);
        }
        return result;
    }
}
