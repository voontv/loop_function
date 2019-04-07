public class Exercise8 {

    public long getFactorial(int factorial) {
        long result = 1;
        if(factorial == 0) {
            return 1;
        }

        for(int integer =1; integer<=factorial; integer++) {
            result *= integer;
        }
        return result;
    }
}
