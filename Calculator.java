public class Calculator {
    private double numberA;
    private double numberB;

    public Calculator(double numberA, double numberB) {
        this.numberA = numberA;
        this.numberB = numberB;
    }

    public double getNumberA() {
        return numberA;
    }
    public double getNumberB() {
        return numberB;
    }

    public double calculate(String regneart) {
        double result = 0;

        switch (regneart) {
            case "plus" -> result = numberA + numberB;
            case "minus" -> result = numberA - numberB;
            case "gange" -> result = numberA * numberB;
            case "divider" -> result = numberA / numberB;
        }

        return result;
    }

    public void printNumbers() {
        System.out.println("a: " + numberA + ", b:" + numberB);
    }

    @Override
    public String toString() {
        return "Calculator{" +
                "numberA=" + numberA +
                ", numberB=" + numberB +
                '}';
    }
}
