public class Exercise9 {

    public double getPi(double epsilon) {
        double result = 0;
        double eps = 0;
        int integer = 0;
        do {
            eps = (double) 4 * 2 / ((2 * integer + 1) * (2 * integer + 3));
            result += eps;
            integer += 2;
            System.out.println("eps "+eps);
        } while (Double.compare(eps,epsilon) > 0);
        System.out.println("result "+result);
        return result;
    }
}
