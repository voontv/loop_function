public class Exercise15 {

    public boolean isTriangle(double edgeA, double edgeB, double edgeC) {
        return (edgeA + edgeB > edgeC && edgeA + edgeC > edgeB && edgeB + edgeC > edgeA);
    }

    public boolean isTriangleSquare(double edgeA, double edgeB, double edgeC) {
        if(!isTriangle(edgeA, edgeB, edgeC)) {
            throw new RuntimeException("Invalid triangle");
        } else {
            return (Double.compare(edgeA * edgeA + edgeB * edgeB, edgeC * edgeC) == 0
                    || Double.compare(edgeA * edgeA + edgeC * edgeA, edgeB * edgeB) == 0
                    || Double.compare(edgeA * edgeA + edgeC * edgeA, edgeB * edgeB) == 0);
        }
    }

    public  boolean isIsoscelesTriangle(double edgeA, double edgeB, double edgeC) {
        if(!isTriangle(edgeA, edgeB, edgeC)) {
            throw new RuntimeException("Invalid triangle");
        } else {
            return (Double.compare(edgeA,edgeB) == 0 || Double.compare(edgeA,edgeC) == 0 || Double.compare(edgeB,edgeC) == 0);
        }
    }

    public boolean isEquilateralTriangle(double edgeA, double edgeB, double edgeC) {
        if(!isTriangle(edgeA, edgeB, edgeC)) {
            throw new RuntimeException("Invalid triangle");
        } else {
            return (Double.compare(edgeA,edgeB) == 0 && Double.compare(edgeA,edgeC) == 0);
        }
    }

    public double getCircumferenceTriangle(double edgeA, double edgeB, double edgeC) {
        if(!isTriangle(edgeA, edgeB, edgeC)) {
            throw new RuntimeException("Invalid triangle");
        } else {
            return (edgeA + edgeB + edgeC);
        }
    }

    public double getAreaTriangle(double edgeA, double edgeB, double edgeC) {
        if(!isTriangle(edgeA, edgeB, edgeC)) {
            throw new RuntimeException("Invalid triangle");
        } else {
            double half_cir = getCircumferenceTriangle(edgeA, edgeB, edgeC)/2.0;
            return Math.sqrt(half_cir * (half_cir - edgeA) * (half_cir - edgeB) * (half_cir - edgeC));
        }
    }
}
