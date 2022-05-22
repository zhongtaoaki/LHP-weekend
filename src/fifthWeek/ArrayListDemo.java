package fifthWeek;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList<Country> arrayList = new ArrayList<>();
        // arrayList.add(new Country("China", "Beijing"));
        // arrayList.add(new Country("Japan", "Tokyo"));
        // arrayList.add(new Country("USA", "WDC"));
        // arrayList.add(new Country("UK", "London"));

        

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("请输入国家（如果结束请输入end）");
            String country = scanner.nextLine();

            if (country.equals("end")) {
                break;
            }
            System.out.println("请输入这个国家的首都");
            String capital = scanner.nextLine();
            arrayList.add(new Country(country, capital));
        }

        for (Country country : arrayList) {
            System.out.println(country);
        }

    }
}
