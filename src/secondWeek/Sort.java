package secondWeek;

public class Sort {

    static void sort(int[] array) {

        // 4 + 3 + 2 + 1

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }

        for (int i : array) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int[] array = { 2, 5, 1, 4, 3 };
        sort(array);
    }
}
