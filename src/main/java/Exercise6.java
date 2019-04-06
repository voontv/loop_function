public class Exercise6 {

    public float getDelta(float a, float b, float c) {
        return Math.round(((b * b) - 4 * a *c) * 100) / 100;
    }

    public StringBuilder solveEquation(float a, float b, float c) {
        StringBuilder builder = new StringBuilder();
        float delta = getDelta(a, b, c);

        if(delta == 0) {
            double x = (double) -b / (2 * a);
            x = Math.floor(x * 100) / 100;
            return builder.append("x = ").append(x);
        } else if (delta <0) {
            return builder.append("VN");
        } else {
            float sqrtDeleta = (float) Math.sqrt(delta);
            return builder.append("x1 = ").append((-b + sqrtDeleta)/ (2 * a)).append(" x2 = ").append((-b - sqrtDeleta)/ (2 * a));
        }
    }
}
