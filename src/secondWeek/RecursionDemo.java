package secondWeek;

/**
 * 方法的递归
 */
public class RecursionDemo {
    
    // int i = 5；

    static int method(int i){
        if (i == 1) {
            return 1;
        }
        return i * method(i-1);
    }

    public static void main(String[] args) {
        System.out.println(method(5));
    }

}
