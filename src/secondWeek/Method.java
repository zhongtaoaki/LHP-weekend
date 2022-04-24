package secondWeek;

/**
 * 方法的声明
 * 修饰符 返回值 方法名（入参）{}
 * 
 * 方法声明在类内
 * 方法名的起名规范和变量的起名规范一致
 * 首字母小写，使用小驼峰命名原则
 * 入参的位置写的是该方法传进来的参数的数据类型和参数名 （argument パラメータ）
 * 入参可以不是一个，可以是没有，一个，或者多个,多个参数是有顺序的
 * 返回值位置写的是这个方法返回的值的数据类型或者写void
 * 第二周写的所有方法的修饰符位置都只写static
 * 方法体，写的是该方法的具体处理，写在方法之后的{}里,当方法有返回值的时候必须要写return
 * 返回值是void的话不能有return关键词
 * 当return被执行的时候，会直接跳出该方法
 * 
 * 方法的使用
 * 静态方法在本类内部可以直接使用方法名的方式去调用
 * 调用的位置在另一个方法内
 * 方法调用的时候，给的参数一定要和方法声明位置的参数保持一致，数据类型和数量和顺序都要保持一致
 * 
 * 变量的生命周期
 * 在离他最近的大括号内
 * 
 * DRY
 * Dont Repeat Yourself
 * 
 * 扩展性
 * 简化代码明确思路，可以专注你要做的事情
 */
public class Method {

    public static void main(String[] args) {

        // 求2 - 1000里的素数的个数
        // 循环一下 2-1000
        // 判断一下是否为素数

        int count = 0;
        for (int i = 2; i < 1000; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        System.out.println(count);

    }

    static boolean isPrime(int i) {
        for (int j = 2; j < i; j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }
}
