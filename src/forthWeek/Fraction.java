package forthWeek;

public class Fraction {

    public int numerator;
    public int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        if (denominator != 0) {
            this.denominator = denominator;
        }else{
            System.out.println("分母不能为0");
        }
        
    }

    public Fraction multiple(Fraction f) {
        //return new Fraction(f.numerator * this.numerator, f.denominator * this.denominator);
        int a = f.numerator * this.numerator;
        int b = f.denominator * this.denominator;
        return new Fraction(a, b);
    
    }

    public String toString() {
        return numerator + "/" + denominator;
    }

    public static void main(String[] args) {

        Fraction fraction1 = new Fraction(1, 3);
        Fraction fraction2 = new Fraction(3, 4);
        System.out.println(fraction1.multiple(fraction2).toString());
    }
}
