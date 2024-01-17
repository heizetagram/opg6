public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Calculator calculator = new Calculator(4.2, 5.3);

        calculator.printNumbers();

        ScientificCalculator scientificCalculator = new ScientificCalculator(6.2, 3.2);

        System.out.println(scientificCalculator.calculate("sqrt"));
    }
}
