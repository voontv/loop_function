public class Exercise5 {

    public int getFiboInPosition(int position) {
        if(position == 1 || position == 2) {
            return 1;
        }
        return getFiboInPosition(position - 1) + getFiboInPosition(position - 2);
    }

    public StringBuilder printDigitFiboInRange(int range) {
        StringBuilder builder = new StringBuilder();
        int integer = 1;

        while(getFiboInPosition(integer) <= range) {
            if(getFiboInPosition(integer+1) <= range) {
                builder.append(getFiboInPosition(integer)).append(" ");
            } else {
                builder.append(getFiboInPosition(integer));
            }
            integer++;
        }
        return builder;
    }
}
