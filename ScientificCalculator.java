public class ScientificCalculator extends Calculator {

    public ScientificCalculator(double numberA, double numberB) {
        super(numberA, numberB);
    }

    @Override
    public double calculate(String regneart) {
        double result = 0;

        switch (regneart) {
            case "plus" -> result = getNumberA() + getNumberB();
            case "minus" -> result = getNumberA() - getNumberB();
            case "gange" -> result = getNumberA() * getNumberB();
            case "divider" -> result = getNumberA() / getNumberB();
            case "sqrt" -> result = Math.sqrt(getNumberA());
        }

        return result;
    }
}
