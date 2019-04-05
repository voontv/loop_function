public class Exercise1 {

    public int getLargestCommonDivisor(int integerA, int integerB) {
        if(integerA == 0 || integerB ==0) {
            return Math.abs(integerA+integerB);
        }

        while(integerA != integerB) {
            if(integerA >= integerB) {
                integerA -= integerB;
            } else {
                integerB -= integerA;
            }
        }
        return integerA;
    }

    public int getLowestCommonMultiples(int integerA, int integerB) {
        return (integerA * integerB) / getLargestCommonDivisor(integerA, integerB);
    }
}
