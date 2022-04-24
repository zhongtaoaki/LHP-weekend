package secondWeek;

/**
 * 方法的重载 overload オーバロード
 * 方法名一致，入参不一致的两个方法构成方法的重载
 * 以下三种情况满足一个就是入参不一致：
 * 1.入参的数据类型不一致
 * 2.入参的个数不一致
 * 3.入参的顺序不一致
 * 方法的重载与方法体
 */
public class Overload {

    // 计算正方形面积的方法
    static int getArea(int a) {
        return a * a;
    }

    // 计算长方形面积的方法
    static int getArea(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        System.out.println(getArea(5));
        System.out.println(getArea(5, 6));
    }

}
