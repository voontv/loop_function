@SuppressWarnings("IntegerDivisionInFloatingPointContext")
public class Exercise10 {

    public double getPI(double epsilon) {
        double result = 3;
        double eps;

        int i = 2;

        do {

            eps = (double) 4/ (i *( i + 1) * ( i + 2)) - 1 /((i + 2) * (i + 3) * (i + 4));
            result += eps;

        } while(Double.compare(eps,epsilon)>1);

        return result;
    }
}
