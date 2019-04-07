@SuppressWarnings("IntegerDivisionInFloatingPointContext")
public class Exercise10 {

    public double getPI(double epsilon) {
        double result = 3;
        double eps;
        int integer = 2;
        do {
            eps = (double) 1/ (integer *( integer + 1) * ( integer + 2)) - 1 /((integer + 2) * (integer + 3) * (integer + 4));
            result += 4*eps;
        } while(Double.compare(eps,epsilon)>1);
        return result;
    }
}
