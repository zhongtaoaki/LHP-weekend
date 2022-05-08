package thirdWeek;

/**
 * 类的(成员)方法的声明
 * （修饰符） 返回值 方法名（入参）{
 * 方法体
 * }
 * 
 * 没有被static修饰的方法都是成员方法
 * 没有被static修饰的属性都是成员变量
 * 
 * 使用成员方法需要使用
 * 对象.方法名的方式去使用
 * 
 * 构造器
 * 每个类都有一个默认的无参空构造，当你写下一个构造器时，原来的无参空构造会消失
 * 构造器有返回值，但是不写,返回值的数据类型就是这个类，返回的值就是这个类的新的对象
 * 构造器的方法名与类名一致
 * 构造器默认是没有入参的，可以有
 * 构造器是可以重载的
 * 构造器是用来初始化一个对象的
 * 在构造器中，this关键词代指即将生成的这个对象
 */
public class MethodDemo {

    public static void main(String[] args) {

        Cat cat1 = new Cat();
        cat1.bite();
        System.out.println("这只猫的年龄是：" + cat1.age);
        System.out.println("这只猫的品种是：" + cat1.kind);

        Cat cat2 = new Cat(2);
        System.out.println("cat2的年龄是：" + cat2.age);

        Cat cat3 = new Cat(3,"America Shortcut");
    }
}

class Cat {

    int age;
    String kind;

    Cat() {
    }

    Cat(int age) {
        this.age = age;
    }

    void bite() {
        System.out.println("Meow,Meow");
    }

}
