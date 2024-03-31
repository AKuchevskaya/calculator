public class Calculator {
    private Operation strategy;
    public Calculator(Operation strategy) {
        this.strategy = strategy;
    }
    public double calculate(double num1, double num2) {
        return strategy.execute (num1, num2);
    }
}
