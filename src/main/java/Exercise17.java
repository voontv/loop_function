public class Exercise17 {

    public int countNumberDigit(long number) {
        int count = 0;

        while (number > 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    public boolean isLengthDigitCorrectRule(long number) {
        return (countNumberDigit(number) >= 2 && countNumberDigit(number) <= 5);
    }

    public boolean isDigitCorrectRule(long number) {
        long result = 0;
        long tempNumber = number;
        int lengthDigit = countNumberDigit(number);

        if(!isLengthDigitCorrectRule(tempNumber)) {
            return false;
        }

        do {
            result += Math.pow(tempNumber % 10,lengthDigit);
            tempNumber /= 10;
        } while(tempNumber>0);
        return (result == number);
    }

    public StringBuilder printisDigitCorrectRuleInRange() {
        int number = 10;
        StringBuilder builder = new StringBuilder();

        while(isLengthDigitCorrectRule(number)) {
            if(isDigitCorrectRule(number)) {
                builder.append(number).append(" ");
            }
            number++;
        }
        return  builder;
    }
}
