package thirdWeek;

/**
 * 访问修饰符
 * 访问修饰符用来修饰类，变量，方法，构造器
 * 决定的是可见范围
 * public：所有范围
 * protected： 包内和异包子类
 * default：包内 , default不写
 * private：类内
 * 
 * 面向对象的三大特性之一：封装 カプセル
 */
public class AccessModifierDemo {

    public static void main(String[] args) {

        Animal animal = new Animal(2);
        // animal.setAge(2);

        System.out.println(animal.getAge());
    }
}

class Animal {

    private int age;

    public Animal(int age) {
        this.age = age;
    }

    // public void setAge(int age) {
    // this.age = age;
    // }

    public int getAge() {
        return this.age;
    }
}