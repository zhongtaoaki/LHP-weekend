package fifthWeek;

import java.util.Scanner;

public class ScannerDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Country[] countries = new Country[4];

        for (int k = 0; k < countries.length; k++) {
            System.out.println("请输入一个国家");
            String i = sc.next();
            System.out.println("请再输入这个国家的首都");
            String j = sc.next();

            Country country = new Country(i, j);
            countries[k] = country;
        }

        for (Country country : countries) {
            System.out.println(country);
        }

        sc.close();
    }
}
