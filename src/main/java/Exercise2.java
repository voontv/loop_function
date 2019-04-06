public class Exercise2 {

    public int totalDigits(int integer) {
        int total=0;

        while(integer > 0) {
            total += integer % 10;
            integer /= 10;
        }
        return total;
    }

    public int multiplicationDigits(int integer) {
        int multi=1;

        while(integer > 0) {
            multi *= integer % 10;
            integer /= 10;
        }
        return multi;
    }
}
