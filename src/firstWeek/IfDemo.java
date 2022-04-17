package firstWeek;
/**
 * if 条件分岐
 * if的条件语句里本质上一个boolean
 * 
 */
public class IfDemo {

    public static void main(String[] args) {

        // 有一个整数i，判断它是不是偶数

        int i = 0;

        if (i == 0) {
            System.out.println("它是零");
        } else if (i > 0) {
            System.out.println("它是一个正数");
        } else {
            System.out.println("它是一个负数");
        }

        int j = 55;

        if (j % 2 == 0) {
            System.out.println(j + "这是一个偶数");
        } else {
            System.out.println(j + "是一个奇数");
        }

        System.out.println(1 + 1);
        System.out.println("1" + "1");
    }
}
