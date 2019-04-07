public class Exercise16 {

    public double getEdgeLength(double x1, double x2, double y1, double y2) {
        return Math.sqrt(Math.pow((x1 - x2), 2.0) + Math.pow(y1 - y2, 2.0));
    }

    public boolean isTriangleSquare(double x1, double x2, double x3, double y1, double y2, double y3) {
        double ABx =  x1 - x2;
        double ABy =  y1 - y2;
        double ACx =  x1 - x3;
        double ACy =  y1 - y3;
        double BCx =  x2 - x3;
        double BCy =  y2 - y3;
        return (Double.compare(ABx * ACx + ABy * ACy, 0) == 0
                    || Double.compare(ABx * BCx + ABy * BCy, 0) == 0
                    || Double.compare(ACx * BCx + ACy * BCy, 0) == 0);
    }

    public boolean isIsoscelesTriangle(double x1, double x2, double x3, double y1, double y2, double y3) {
        double ABx =  x1 - x2;
        double ABy =  y1 - y2;
        double ACx =  x1 - x3;
        double ACy =  y1 - y3;
        double BCx =  x2 - x3;
        double BCy =  y2 - y3;
        return ( Double.compare(ABx * ABx + ABy * ABy, ACx * ACx + ACy * ACy) == 0
                    || Double.compare(ABx * ABx + ABy * ABy, BCx * BCx + BCy * BCy) == 0
                    || Double.compare(BCx * BCx + BCy * BCy, ACx * ACx + ACy * ACy) == 0);
    }

    public boolean isEquilateralTriangle(double x1, double x2, double x3, double y1, double y2, double y3) {
        double ABx =  x1 - x2;
        double ABy =  y1 - y2;
        double ACx =  x1 - x3;
        double ACy =  y1 - y3;
        double BCx =  x2 - x3;
        double BCy =  y2 - y3;
        return ( Double.compare(ABx * ABx + ABy * ABy, ACx * ACx + ACy * ACy) == 0
                && Double.compare(BCx * BCx + BCy * BCy, ACx * ACx + ACy * ACy) == 0);
    }

    public double getCircumferenceTriangle(double x1, double x2, double x3, double y1, double y2, double y3) {
        double edgeA = getEdgeLength(x1, x2, y1, y2);
        double edgeB = getEdgeLength(x1, x3, y1, y3);
        double edgeC = getEdgeLength(x2, x3, y2, y3);
        return getCircumferenceTriangle(edgeA, edgeB, edgeC);
    }

    public double getAreaTriangle(double x1, double x2, double x3, double y1, double y2, double y3) {
        double edgeA = getEdgeLength(x1, x2, y1, y2);
        double edgeB = getEdgeLength(x1, x3, y1, y3);
        double edgeC = getEdgeLength(x2, x3, y2, y3);
        return getAreaTriangle(edgeA, edgeB, edgeC);
    }

    public double getCircumferenceTriangle(double edgeA, double edgeB, double edgeC) {
        return (edgeA + edgeB + edgeC);
    }

    public double getAreaTriangle(double edgeA, double edgeB, double edgeC) {
        double half_cir = getCircumferenceTriangle(edgeA, edgeB, edgeC)/2.0;
        return Math.sqrt(half_cir * (half_cir - edgeA) * (half_cir - edgeB) * (half_cir - edgeC));
    }
}
