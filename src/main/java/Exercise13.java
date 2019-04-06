public class Exercise13 {

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

    public double totalFactorialInRange(double epsilon) {
        double result = 0.0;
        int integer = 0;
        double eps;
        do {
            eps = 1.0 / getFactorial(integer);
            result += eps;
            integer++;
        } while (Double.compare(eps,epsilon)>0);
        return result;
    }
}
