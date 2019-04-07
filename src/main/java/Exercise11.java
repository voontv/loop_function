public class Exercise11 {

    public double getInterestRateAfterYear (int range) {
        double money = 100;

        for(int integer  = 1; integer<=range; integer++) {
            money += money * (1.0/range);
        }
        return money;
    }

}
