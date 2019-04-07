public class Exercise7 {

    public double totalInRange(int n) {
        double total = 0;
        for(int integer = 0; integer < n; integer++) {
            total += integer * (integer + 1);
        }
        return total;
    }
}
