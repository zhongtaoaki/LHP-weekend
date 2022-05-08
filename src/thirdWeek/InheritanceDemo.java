package thirdWeek;

import javax.sql.rowset.spi.SyncResolver;

/**
 * 面向对象的第二大特征
 * 继承
 * 
 * 子类 extends 父类
 * 子类会继承父类里的所有非private修饰的变量和方法
 * 继承关系里，子类和父类的方法签名完全一致的情况叫做 重写 override
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

class People {
    public String name = "Human";
    public int age;

    public void speak() {
        System.out.println("Hello World");
    }
}

class Japanese extends People {

    public String name = "Japanese";

    public String getName() {
        return this.name;
    }

    public void speak(String name) {
        System.out.println(name + "さん、こんにちは");
    }
}