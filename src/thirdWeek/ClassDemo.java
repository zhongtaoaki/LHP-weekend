package thirdWeek;

/**
 * 类 class クラス
 * java里是一个编程单位
 * 所有的代码都会类里
 * 
 * 类的声明
 * 访问修饰符 class 类名{
 * }
 * 类名的命名要使用大驼峰命名原则(规范)
 * 类名的首字母是大写的
 * 类的声明在文件内，并且文件名要和类名要保持一致
 * 类内只能可以有变量和方法
 * 变量: 属性
 * 类的属性的声明: 访问修饰符 数据类型 变量名;
 * 
 * 类的使用
 * 在类内使用
 * 类的使用需要用到对象Object
 * 对象就是类的具体实现
 * 生成一个类的对象的时候，要用new关键词
 * 对象.属性名的方式去对属性进行赋值或者是调用操作
 */
public class ClassDemo {

    public static void main(String[] args) {

        Human tom = new Human();
        tom.name = "Tomas";
        tom.age = 20;
        tom.gender = true;

        System.out.println("tom的年龄是: " + tom.age);
        System.out.println("tom的姓名是: " + tom.name);
        if (tom.gender) {
            System.out.println("tom的性别是: 男");
        } else {
            System.out.println("tom的性别是: 女");
        }
    }
}

class Human {
    int age;
    String name;
    boolean gender;


}
