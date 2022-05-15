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

    @Override
    public boolean equals(Object obj) {
        
        //强制数据类型转换的语法
        Fraction f = (Fraction)obj;

        // boolean flag1 = this.numerator == f.numerator;
        // boolean flag2 = this.denominator == f.denominator;
        return (this.numerator == f.numerator) && (this.denominator == f.denominator);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Fraction(this.numerator, this.denominator);
    }
    

    public Fraction multiple(Fraction f) {
        //return new Fraction(f.numerator * this.numerator, f.denominator * this.denominator);
        int a = f.numerator * this.numerator;
        int b = f.denominator * this.denominator;
        return new Fraction(a, b);
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    public static void main(String[] args) {

        Fraction fraction1 = new Fraction(1, 3);
        Fraction fraction2 = new Fraction(3, 4);
        System.out.println(fraction1.multiple(fraction2).toString());
    }
}
