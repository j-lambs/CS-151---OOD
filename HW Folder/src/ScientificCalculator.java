public class ScientificCalculator extends Calculator {

    @Override
    public int add(int a, int b) {
        System.out.println("Using Scientific Calculator to add two integers.");
        return super.add(a ,b);
    }

    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }
}
