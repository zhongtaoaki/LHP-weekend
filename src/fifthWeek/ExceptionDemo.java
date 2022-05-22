package fifthWeek;

public class ExceptionDemo {

    public static void main(String[] args) {

        // int[] array = new int[4];
        // try {
        // System.out.println(array[4]);
        // } catch (ArrayIndexOutOfBoundsException e) {
        // System.out.println("哎呀，你发生错误了");
        // e.printStackTrace();
        // } catch (Exception e) {
        // System.out.println("还发生了另一个错误");
        // } finally{
        // System.out.println("这是finally的代码");
        // }

        // int index = 4;
        // if (index < array.length) {
        // System.out.println(array[index]);
        // }
        // System.out.println(array[0]);
        // System.out.println(array[1]);

        
        try {
            test(5, 0);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            
        }
    }

    static void test(int i, int j) {

        // try {
        // System.out.println(i/j);
        // } catch (ArithmeticException e) {
        // System.out.println("除数不能零");
        // }

        if (j == 0) {
            throw new ArithmeticException("除数不能零");
        }
    }
}
