package Task2;

public class RationalFraction {
    private int numerator;
    private int denominator;

    public RationalFraction() {
        numerator = 0;
        denominator = 1;
    }

    public RationalFraction(int numerator, int denominator) throws ArithmeticException {
        if (denominator == 0) {
            throw new ArithmeticException("Division by 0 can't be provided.");
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public String toString() {
        if (Math.abs(denominator) == 1) {
            return Integer.toString(numerator);
        } else {
            return numerator + "/" + denominator;
        }
    }

    public RationalFraction add(RationalFraction rationalFraction1) {
        int commonDivisor = rationalFraction1.getDenominator() * denominator;
        RationalFraction rationalFraction = new RationalFraction(rationalFraction1.getNumerator() * denominator + numerator * rationalFraction1.getDenominator(), commonDivisor);
        rationalFraction.reduce();
        return rationalFraction;
    }

    public void add2(RationalFraction rationalFraction) {
        numerator = numerator * rationalFraction.getDenominator() + rationalFraction.getNumerator() * denominator;
        denominator = rationalFraction.getDenominator() * denominator;
        reduce();
    }

    public RationalFraction sub(RationalFraction rationalFraction1) {
        int commonDivisor = rationalFraction1.getDenominator() * denominator;
        RationalFraction rationalFraction = new RationalFraction(rationalFraction1.getNumerator() * denominator * (-1) + numerator * rationalFraction1.getDenominator(), commonDivisor);
        rationalFraction.reduce();
        return rationalFraction;
    }

    public void sub2(RationalFraction rationalFraction) {
        numerator = numerator * rationalFraction.getDenominator() - rationalFraction.getNumerator() * denominator;
        denominator = rationalFraction.getDenominator() * denominator;
        reduce();
    }

    public RationalFraction mult(RationalFraction rationalFraction) {
        RationalFraction rationalFraction1 = new RationalFraction(numerator * rationalFraction.getNumerator(), denominator * rationalFraction.getDenominator());
        rationalFraction1.reduce();
        return rationalFraction1;
    }

    public void mult2(RationalFraction rationalFraction) {
        numerator *= rationalFraction.getNumerator();
        denominator *= rationalFraction.getDenominator();
        reduce();
    }

    public RationalFraction div(RationalFraction rationalFraction) {
        RationalFraction rationalFraction1 = new RationalFraction(numerator * rationalFraction.getDenominator(), denominator * rationalFraction.getNumerator());
        rationalFraction1.reduce();
        return rationalFraction1;
    }

    public void div2(RationalFraction rationalFraction) {
        numerator *= rationalFraction.getDenominator();
        denominator *= rationalFraction.getNumerator();
        reduce();
    }

    public double value() {
        return (double) numerator / denominator;
    }

    public int numberPart() {
        return numerator / denominator;
    }

    public boolean equals(RationalFraction rationalFraction) {
        reduce();
        rationalFraction.reduce();
        return numerator == rationalFraction.getNumerator() && denominator == rationalFraction.getDenominator();
    }

    public void reduce() {
        double i = 2;
        if (numerator < 0 && denominator < 0) {
            numerator = Math.abs(numerator);
            denominator = Math.abs(denominator);
        }
        if (denominator < 0) {
            denominator = Math.abs(denominator);
            numerator *= -1;
        }
        do {
            if ((numerator / i) % 1 == 0 && (denominator / i) % 1 == 0) {
                numerator /= i;
                denominator /= i;
                i = 2;
            } else {
                i += 1;
            }
        } while (i <= Math.abs(Math.min(numerator, denominator)));
    }
}
