package firstWeek;
/**
 * 数组
 * 相同数据类型的变量的集合叫做数组
 * 
 * 数组的声明
 * 数组是引用数据类型
 * 数据类型 变量名 = 值；
 * 可以使用{}声明好数组的所有元素
 * 数组的长度是固定的
 * 数组是有顺序的
 * 也可以使用new关键词来声明一个只有长度没有元素的数组
 * 
 * 数组的使用
 * 数组是有下标的，每个元素有自己的下标
 * 下标从0开始数
 * 
 * DRY: Dont Repeat Yourself
 * 
 * 在使用数组的时候，元素下标不可以超过数组长度，也不可以等于数组长度（左闭右开）
 * 数组越界异常
 * ArrayIndexOutOfBoundsException
 */
public class ArrayDemo {

    public static void main(String[] args) {

        int[] array1 = { 0, 1, 2, 3, 4, 5, 6 };

        int[] array2 = new int[7];

        array1[0] = 8;

        System.out.println(array1[0]);
        System.out.println(array1[1]);
        System.out.println(array1[2]);
        System.out.println(array1[3]);
        System.out.println(array1[4]);
        System.out.println(array1[5]);
        System.out.println(array1[6]);

        // int index = 0;

        // while (index < 7) {
        // System.out.println(array1[index]);
        // index++;
        // }

        // important
        for (int index = 0; index < array1.length; index++) {
            System.out.println(array1[index]);
        }

        // 加强for
        for (int i : array1) {
            System.out.println(i);
        }

    }
}
