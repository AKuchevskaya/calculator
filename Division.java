public class Division implements Operation {
    @Override
    public double execute (double num1, double num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException ("Нельзя делить на 0");
        }
        return num1 / num2;
    }
}