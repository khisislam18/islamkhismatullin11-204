package Task2;

public class Main1 {
    public static void main(String[] args) {
        RationalFraction rationalFraction = new RationalFraction(5,-5);
        System.out.println("Unreduced rF:\n" + rationalFraction);
        rationalFraction.reduce();
        System.out.println("\nReduced rF:\n" + rationalFraction);
        RationalFraction rationalFraction1 = new RationalFraction(5,-10);
        System.out.println("\nUnreduced rF1:\n" + rationalFraction1);
        rationalFraction1.reduce();
        System.out.println("\nReduced rF1:\n" + rationalFraction1);
        RationalFraction rationalFraction2 = rationalFraction.add(rationalFraction1);
        System.out.println("\nrF2 = rF + rF1:\n" + rationalFraction2);
        rationalFraction2.add2(rationalFraction1);
        System.out.println("\nrF2 += rF1 \n" + rationalFraction2);
        RationalFraction rationalFraction3 = rationalFraction1.sub(rationalFraction2);
        System.out.println("\nrF3 = rF1 - rF2 \n" + rationalFraction3);
        rationalFraction3.sub2(rationalFraction1);
        System.out.println("\nrF3 -= rF1 \n" + rationalFraction3);
        RationalFraction rationalFraction4 = rationalFraction3.mult(rationalFraction2);
        System.out.println("\nrF4 = rF3 * rF2 \n" + rationalFraction4);
        rationalFraction4.mult2(rationalFraction3);
        System.out.println("\nrF4 *= rF3 \n" + rationalFraction4);
        RationalFraction rationalFraction5 = rationalFraction4.div(rationalFraction);
        System.out.println("\nrF5 = rF4 / rF \n" + rationalFraction5);
        rationalFraction5.div2(rationalFraction2);
        System.out.println("\nrF5 /= rF2 \n" + rationalFraction5);
        System.out.println("\nrF1 Value: \n" + rationalFraction1.value());
        System.out.println("\nrF2 Value: \n" + rationalFraction1.value());
        System.out.println("\nrF3 Value: \n" + rationalFraction3.value());
        System.out.println("\nrF4 Value: \n" + rationalFraction4.value());
        System.out.println("\nrF5 Value: \n" + rationalFraction5.value());
        System.out.println("\nrF1 Number Part: \n" + rationalFraction1.numberPart());
        System.out.println("\nrF2 Number Part: \n" + rationalFraction1.numberPart());
        System.out.println("\nrF3 Number Part: \n" + rationalFraction3.numberPart());
        System.out.println("\nrF4 Number Part: \n" + rationalFraction4.numberPart());
        System.out.println("\nrF5 Number Part: \n" + rationalFraction5.numberPart());
        System.out.println(rationalFraction.equals(rationalFraction1) ? "rF == rF1" : "rF != rF1");
        System.out.println(rationalFraction4.equals(rationalFraction5) ? "rF4 == rF5" : "rF4 != rF5");
    }
}
