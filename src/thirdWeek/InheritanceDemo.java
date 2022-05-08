package thirdWeek;

/**
 * 面向对象的第二大特征
 * 继承
 * 
 * 子类 extends 父类
 * 子类会继承父类里的所有非private修饰的变量和方法
 * 继承关系里，子类和父类的方法签名完全一致的情况叫做 重写 override
 * 
 * java是不允许多继承的
 * 
 * abstract关键词可以使一个父类变成抽象类
 * 抽象类存在的意义不是被new，而是被继承
 * 抽象类是不可以被实例化的，能够被实例化的类叫做实体类
 * 抽象类中可以有抽象方法，有抽象方法的只能是抽象类
 * 实体类必须要重写父类中的抽象方法
 * 没有方法体的方法叫做抽象方法，用abstract修饰
 * 
 */
public class InheritanceDemo {

    public static void main(String[] args) {

        Japanese satou = new Japanese();
        // satou.name = "佐藤";
        satou.age = 20;
        satou.speak("鈴木");
        satou.speak();
        System.out.println(satou.getName());
    }
}

abstract class People implements Language{

    public String name = "Human";
    public int age;

}

class Japanese extends People {

    public String name = "Japanese";

    public String getName() {
        return this.name;
    }

    public void speak(String name) {
        System.out.println(name + "さん、こんにちは");
    }

    @Override
    public void speak() {
        System.out.println("こんにちは");
    }
}

class American extends People {

    @Override
    public void speak() {
        System.out.println("Hello World");
    }
    
}

