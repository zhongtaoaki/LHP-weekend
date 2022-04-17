package firstWeek;
/**
 * 循环 ループ
 * while
 * （）里写的是循环结束的条件
 * {}循环体 循环的内容
 * 迭代器
 * 如果没有迭代器就会陷入无限循环 無限ループ
 * break关键词可以强行跳出循环
 * continue跳过本次循环
 * 
 * while和dowhile的循环次数是一样的
 * dowhile会在即使条件不满足的时候也执行一次循环体
 * 
 */
public class RoopDemo {
    public static void main(String[] args) {

        // int i = 1;

        // int j = 0;
        // 找到一个被7整除的数
        // while (true) {
        // System.out.println("j:是 " + j++);
        // i++;
        // }

        // do {
        // i++;
        // } while (i < 0);

        // System.out.println(i + "是7的整数");

        for (int i = 0; i < 10; i++) {

            if (i % 7 == 0) {
                System.out.println(i);
            }
        }
    }
}
