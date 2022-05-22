package fifthWeek;

public class Practice1 {
    public static void main(String[] args) {
        
        String[] array = {"a", "b", "c", "d"};
        for (int i = 0; i < array.length/2; i++) {
            String temp = array[i];
            array[i] = array[array.length-i-1];
            array[array.length-i-1] = temp;
        }

        for (String string : array) {
            System.out.println(string);
        }
    }
}
