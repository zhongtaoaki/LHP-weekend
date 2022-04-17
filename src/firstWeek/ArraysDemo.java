package firstWeek;

/**
 * 
 * 二维数组
 * 数组元素数组元素的数组
 */
public class ArraysDemo {

    public static void main(String[] args) {

        String[] array = { "1", "2", "3" };

        int[][] array2 = { { 1, 2, 3 }, { 7, 8, 9 } };

        int[][] array3 = new int[3][];
        int[][] array4 = new int[3][4];

        int i = array2[0][0];
        System.out.println(i);

        for (int[] is : array2) {
            for (int j : is) {
                System.out.println(j);
            }
        }

        for (int indexOut = 0; indexOut < array2.length; indexOut++) {
            for (int indexIn = 0; indexIn < array2[indexOut].length; indexIn++) {
                System.out.println(array2[indexOut][indexIn]);
            }
        }
    }
}
