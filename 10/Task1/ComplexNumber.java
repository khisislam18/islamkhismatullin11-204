import java.text.DecimalFormat;

public class ComplexNumber {
    private double realPart;
    private double complexPart;

    public double getRealPart() {
        return realPart;
    }

    public double getComplexPart() {
        return complexPart;
    }

    public ComplexNumber(){}
    public ComplexNumber(double realPart, double complexPart){
        this.realPart = realPart;
        this.complexPart = complexPart;
    }

    public ComplexNumber add(ComplexNumber complexNumber){
        return new ComplexNumber(realPart + complexNumber.getRealPart(), complexPart + complexNumber.getComplexPart());
    }

    public void add2(ComplexNumber complexNumber){
        realPart += complexNumber.getRealPart();
        complexPart += complexNumber.getComplexPart();
    }

    public ComplexNumber sub(ComplexNumber complexNumber){
        return new ComplexNumber(realPart - complexNumber.getRealPart(), complexPart - complexNumber.getComplexPart());
    }

    public void sub2(ComplexNumber complexNumber){
        realPart -= complexNumber.getRealPart();
        complexPart -= complexNumber.getComplexPart();
    }
    public ComplexNumber multNumber(double a){
        return new ComplexNumber(realPart * a, complexPart * a);
    }

    public void multNumber2(double a){
        realPart *= a;
        complexPart *= a;
    }

    public ComplexNumber mult(ComplexNumber complexNumber){
        return new ComplexNumber(realPart * complexNumber.getRealPart() - complexPart * complexNumber.getComplexPart(),realPart * complexNumber.getComplexPart() + complexPart * complexNumber.getRealPart());
    }

    public void mult2(ComplexNumber complexNumber){
        realPart = realPart * complexNumber.getRealPart() - complexPart * complexNumber.getComplexPart();
        complexPart = realPart * complexNumber.getComplexPart() + complexPart * complexNumber.getRealPart();
    }

    public ComplexNumber div(ComplexNumber complexNumber) throws ArithmeticException{
        if(complexNumber.getRealPart() == 0 && complexNumber.getComplexPart() == 0){
            throw new ArithmeticException("Denominator can't be zero.");
        }
        return new ComplexNumber((realPart * complexNumber.getRealPart() + complexPart * complexNumber.getComplexPart())/(Math.pow(complexNumber.getRealPart(),2) + Math.pow(complexNumber.getComplexPart(), 2)),
                ((complexNumber.getRealPart()) * complexPart - realPart * complexNumber.getComplexPart())/(Math.pow(complexNumber.getRealPart(), 2) + Math.pow(complexNumber.getComplexPart(), 2)));
    }
    public void div2(ComplexNumber complexNumber) throws ArithmeticException{
        if(complexNumber.getRealPart() == 0 && complexNumber.getComplexPart() == 0){
            throw new ArithmeticException("Denominator can't be zero.");
        }
        realPart = (realPart * complexNumber.getRealPart() + complexPart * complexNumber.getComplexPart())/(Math.pow(complexNumber.getRealPart(),2) + Math.pow(complexNumber.getComplexPart(), 2));
        complexPart = ((complexNumber.getRealPart()) * complexPart - realPart * complexNumber.getComplexPart())/(Math.pow(complexNumber.getRealPart(), 2) + Math.pow(complexNumber.getComplexPart(), 2));
    }
    public double length(){
        return Math.sqrt(Math.pow(realPart, 2) + Math.pow(complexPart, 2));
    }
    public String toString(){
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        if(complexPart < 0){
            return (realPart != 0 ? decimalFormat.format(realPart) + " - ": "-") + (complexPart != -1 ? decimalFormat.format(Math.abs(complexPart)) : "") + "i";
        } else if (complexPart == 0) {
            return decimalFormat.format(realPart);
        }else if (complexPart == 1) {
            return realPart != 0 ? decimalFormat.format(realPart) + " + i" : "i";
        }else{
            return (realPart != 0 ? decimalFormat.format(realPart) + " + " : "") + decimalFormat.format(complexPart) + "i";
        }
    }
    public double arg(){
        return complexPart < 0 ? -Math.acos(realPart/length()) : complexPart == 0 ? realPart < 0 ? -Math.PI : 0 : Math.acos(realPart/length());
    }
    public ComplexNumber pow(double n){
        return new ComplexNumber(Math.pow(length(), n) * Math.cos(n * arg()), Math.pow(length(), n) * Math.sin(n * arg()));
    }
    public boolean equals(ComplexNumber complexNumber){
        return realPart == complexNumber.getRealPart() && complexNumber.getComplexPart() == complexPart;
    }
}
