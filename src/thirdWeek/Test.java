package thirdWeek;

public class Test {

    public static void main(String[] args) {

        System.out.println(new Add().calculate(4, 2));
        System.out.println(new Sub().calculate(4, 2));
        System.out.println(new Multi().calculate(4, 2));
        System.out.println(new Div().calculate(4, 2));
    }
}

class Add implements Token {
    @Override
    public int calculate(int a, int b) {
        return a + b;
    }
}

class Sub implements Token {
    @Override
    public int calculate(int a, int b) {
        return a - b;
    }
}

class Multi implements Token {
    @Override
    public int calculate(int a, int b) {
        return a * b;
    }
}

class Div implements Token {
    @Override
    public int calculate(int a, int b) {
        return a / b;
    }
}