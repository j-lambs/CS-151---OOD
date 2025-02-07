public class HW3 {
    public static void main(String args[]) {
        Calculator myCalc = new Calculator();
        System.out.println(myCalc.add(2.0, 5.9));

        ScientificCalculator sci = new ScientificCalculator();
        System.out.println(sci.add(5, 10));
        System.out.println(sci.power(2, 3));
    }
}
