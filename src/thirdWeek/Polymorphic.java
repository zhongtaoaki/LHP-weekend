package thirdWeek;

/**
 * 多态
 * 1.继承或者实装
 * 2.子类重写父类的方法
 * 3.父类引用指向子类
 * 
 * 继承关系的本质
 * A extends B
 * A is B
 * 对象 is 类
 * 
 * 子类对象 is Add的这个类
 * Add is Token
 * 子类对象 is Token
 */
public class Polymorphic {
    
    public static void main(String[] args) {

        Token token1 = new Add();

        // Token token;
        // Add add = new Add();
        // token = add;

        // Token token2 = new Sub();
        // Token token3 = new Multi();
        // Token token4 = new Div();
        // System.out.println(token1.calculate(1, 2));
        // System.out.println(token2.calculate(1, 2));
        // System.out.println(token3.calculate(1, 2));
        // System.out.println(token4.calculate(1, 2));

        Token[] tokens = {new Add(),new Sub(),new Multi(),new Div()};
        
        for (Token token : tokens) {
            System.out.println(token.calculate(4, 2));
        }

        System.out.println(tokens);
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
