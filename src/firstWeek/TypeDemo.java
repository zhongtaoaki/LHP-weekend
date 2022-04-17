package firstWeek;
/**
 * 程序的本质就是对数据的处理
 * 使用一个变量来装一个数据
 * 
 * 变量的声明和变量的使用
 * 
 * 变量的声明
 * 数据类型 变量名 = 值；
 * 数据类型分为基本数据类型和引用数据类型
 * 基本数据类型：
 * 整数：
 * byte 【-128，127】
 * short 65526 
 * int 21亿 （默认）
 * long 
 * bit，8bit = 1byte（256）
 * 
 * 小数
 * float 单精度（小数点后8位）
 * double 双精度（小数点16位）
 * 
 * char 字符 加上单引号，且只能是一个字符 取值范围与short一直 根据ascii
 * 
 * boolean 布尔 0 or 1
 * 
 * 引用数据类型
 * 除了8个基本数据类型以外都叫引用数据类型
 * String 字符串（文字列）　需要用双引号“”括起来
 * 
 * 变量名，代称
 * 命名规定：只能用数字英文$_,并且开头只能是英文
 * 命名规范：开头必须是小写的英文字母，并且遵守驼峰命名原则
 * 
 * =
 * 赋值符号，
 * 不表示相等
 */
public class TypeDemo {
    
    public static void main(String[] args) {
        
        int d = 16;

        char c = 65;
        boolean b = false;

        System.out.println(c);
        System.out.println("Hello world");

        int studentAge = 21;
    }
}
