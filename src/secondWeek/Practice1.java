package secondWeek;

/**
 * 准备一个二维数组，每个元素都是int
 * 计算一下这个二维数组里的所有数字的和
 * 打印这个和
 */
public class Practice1 {

    public static void main(String[] args) {

        int[][] array = { { 1, 2, 3 }, { 1, 2, 3 }, { 1, 2, 3 } };

        int sum = 0;
        for (int[] is : array) {
            for (int i : is) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
