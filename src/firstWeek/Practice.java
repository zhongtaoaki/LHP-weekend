package firstWeek;

/**
 * 
 * 10以内的正整数输出出来
 * 
 * 变量的生命周期在它最近的大括号内
 */
public class Practice {

    public static void main(String[] args) {

        int[] array = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        for (int i : array) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println(array[i]);
            }
        }

        int i = 0;
        while (i < array.length) {
            if (array[i] % 2 == 0) {
                System.out.println(array[i]);
            }
            i++;
        }
    }
}
