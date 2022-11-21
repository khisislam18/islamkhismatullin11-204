public class Main1 {
    public static void main(String[] args) {
        ComplexNumber complexNumber1 = new ComplexNumber(0,0);
        System.out.println(complexNumber1);
        ComplexNumber complexNumber2 = new ComplexNumber(0,1);
        System.out.println(complexNumber2);
        complexNumber2.mult2(complexNumber1);
        System.out.println(complexNumber2);
        ComplexNumber complexNumber3 = complexNumber1.add(complexNumber2);
        System.out.println("a3 = a1 + a2\n" + complexNumber3);
        complexNumber3.add2(complexNumber2);
        System.out.println("a3 += a2\n" + complexNumber3);
        ComplexNumber complexNumber4 = complexNumber3.div(complexNumber2);
        System.out.println("a4 = a3 / a2\n" + complexNumber4);
        complexNumber4.div2(complexNumber1);
        System.out.println("a4 /= a1\n" + complexNumber4);
        ComplexNumber complexNumber5 = complexNumber4.mult(complexNumber3);
        System.out.println("a5 = a4 * a3\n" + complexNumber5);
        complexNumber5.mult2(complexNumber4);
        System.out.println("a5 *= a4\n" + complexNumber5);
        ComplexNumber complexNumber6 = complexNumber5.sub(complexNumber4);
        System.out.println("a6 = a5 - a4\n" + complexNumber6);
        complexNumber6.sub2(complexNumber3);
        System.out.println("a6 -= a3\n" + complexNumber6);
        complexNumber6.multNumber2(5);
        System.out.println("a6 *= k\n" + complexNumber6);
        ComplexNumber complexNumber7 = complexNumber6.pow(2);
        System.out.println("a7 = a6 ^ n\n" + complexNumber7);
        ComplexNumber complexNumber8 = complexNumber7.multNumber(5);
        System.out.println("a8 = a7 * CONST\n" + complexNumber8);
        System.out.println("Complex module of a1: " + complexNumber1.length());
        System.out.println("Complex module of a2: " + complexNumber2.length());
        System.out.println("Complex module of a3: " + complexNumber3.length());
        System.out.println("Complex module of a4: " + complexNumber4.length());
        System.out.println("Complex module of a5: " + complexNumber5.length());
        System.out.println("Complex module of a6: " + complexNumber6.length());
        System.out.println("Complex module of a7: " + complexNumber7.length());
        System.out.println("Argument of complex of a1: " + complexNumber1.arg());
        System.out.println("Argument of complex of a2: " + complexNumber2.arg());
        System.out.println("Argument of complex of a3: " + complexNumber3.arg());
        System.out.println("Argument of complex of a4: " + complexNumber4.arg());
        System.out.println("Argument of complex of a5: " + complexNumber5.arg());
        System.out.println("Argument of complex of a6: " + complexNumber6.arg());
        System.out.println("Argument of complex of a7: " + complexNumber7.arg());
        System.out.println(complexNumber1.equals(complexNumber2) ? "a1 == a2: " + complexNumber1 + " == " + complexNumber2: "a1 != a2: " + complexNumber1 + " != " + complexNumber2);
        System.out.println(complexNumber3.equals(complexNumber4) ? "a3 == a4: " + complexNumber3 + " == " + complexNumber4: "a3 != a4: " + complexNumber3 + " != " + complexNumber4);
        System.out.println(complexNumber5.equals(complexNumber6) ? "a5 == a6: " + complexNumber5 + " == " + complexNumber6: "a5 != a6: " + complexNumber5 + " != " + complexNumber6);
    }
}
