public class Main {
    public static void main(String[] args) {
        Addition addition = new Addition();
        Calculator calculator = new Calculator(addition);
        double result = calculator.calculate(5, 3);
        System.out.println("Результат сложения: " + result);

        Multiplication multiplication = new Multiplication();
        calculator = new Calculator(multiplication);
        result = calculator.calculate(5, 3);
        System.out.println("Результат умножения: " + result);

        Division division = new Division();
        calculator = new Calculator(division);
        result = calculator.calculate(6, 0);
        System.out.println("Результат деления: " + result);
        
        Logger logger = Logger.getInstance();
        logger.log("Работа калькулятора окончена без ошибок");
    }
}
