package fifthWeek;

import java.util.Scanner;

public class ScannerDemo {
    

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个底数");
        int i = sc.nextInt();
        System.out.println("请再输入一个指数");
        int j = sc.nextInt();
        //String s = sc.nextLine();

        System.out.println(Math.pow(i, j));

        //System.out.println(s);

        sc.close();

    }

}
