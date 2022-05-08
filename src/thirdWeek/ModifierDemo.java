package thirdWeek;

/**
 * 修饰符
 * 类，变量，方法的声明位置都是可以写修饰符
 * 修饰符包含访问修饰符，非访问修饰符
 * 非访问修饰符 static final
 * 
 * static 静态
 * 被static修饰的变量以及方法属于类而不是属于对象
 * 要用类.变量名/方法名去调用
 * 用static修饰一个变量给上初始值
 * 不要轻易的修改被static修饰的变量, 不安全
 * 可以final修饰不想被更改的变量
 * 叫做常量
 * 常量的命名，使用全部大写
 * 
 * 被static修饰的方法叫做静态方法，
 * 静态方法使用类.方法名的方式去调用
 * 如果调用的位置是在类内，那类名可以省略
 */
public class ModifierDemo {

    public static void main(String[] args) {

        Dog wangcai = new Dog();
        wangcai.age = 2;
        //wangcai.bite();

        System.out.println("狗的叫声是： " + Dog.VOICE);

        Dog laifu = new Dog();
        laifu.age = 3;

        //Dog.voice = "miao";

        //laifu.bite();

        Dog.bite();

        // System.out.println(wangcai.age);
        // System.out.println(laifu.age);
        // System.out.println(wangcai.voice);

    }

}

class Dog {

    int age;

    final static String VOICE = "wang";

    static void bite(){
        System.out.println(VOICE);
    }

}