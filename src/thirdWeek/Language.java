package thirdWeek;

/**
 * 接口
 * 是一个系统向外暴露的一个窗口
 * 这个窗口要明确外界和系统进行连接的时候的规范
 * 使用interface关键词声明一个接口
 * 接口不能被实例化
 * 存在的意义就是被实装
 * 在接口中只能存在抽象方法
 * 
 * 用类 implements 接口的方式去实装一个接口
 * 
 * 接口里所有的方法的范围都是public，但是不写
 * 所有的方法都是abstract，但是不写
 * 
 * 新版本的interface
 * 是可以有属性和非抽象方法的
 * 属性只能是静态的
 * 非抽象方法需要用default修饰
 */
public interface Language {
    
    void speak();

}
