package secondWeek;

/**
 * 判断素数
 * 2-1000有多少个素数
 */
public class Practice2 {
    public static void main(String[] args) {

        int count = 0;

        // 把这件事重复999遍
        for (int i = 2; i <= 1000; i++) {
            // 判断一个数是不是素数
            boolean isPrime = true;
            for (int j = 2; j <= i/2; j++) {
                if (i % j == 0) {
                    // 说明这个数不是我们要的数
                    isPrime = false;
                }
            }
            if (isPrime) {
                // 证明这个数是素数
                System.out.println(i);
                count++;
            }
        }
        System.out.println(count);
    }
}