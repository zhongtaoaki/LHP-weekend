package fifthWeek;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListDemo {
    public static void main(String[] args) {

        // ArrayList<Country> arrayList = new ArrayList<>();
        // // arrayList.add(new Country("China", "Beijing"));
        // // arrayList.add(new Country("Japan", "Tokyo"));
        // // arrayList.add(new Country("USA", "WDC"));
        // // arrayList.add(new Country("UK", "London"));

        // Scanner scanner = new Scanner(System.in);

        // while (true) {
        //     System.out.println("请输入国家（如果结束请输入end）");
        //     String country = scanner.nextLine();

        //     if (country.equals("end")) {
        //         break;
        //     }
        //     System.out.println("请输入这个国家的首都");
        //     String capital = scanner.nextLine();
        //     arrayList.add(new Country(country, capital));
        // }

        // for (Country country : arrayList) {
        //     System.out.println(country);
        // }

        //引用数据类型 字符串 所以的class 接口 数组 枚举
        //arraylist的元素的数据类型只能是引用数据类型
        //基本数据类型要使用它的包装类 wrapper class
        // Byte Short Integer Long Double Float Boolean Character
        //把基本数据类型自动转换成对应的包装类，叫做自动装箱
        List<Integer> arrayList2 = new ArrayList<>();
        //Integer i = new Integer(1);
        arrayList2.add(1);
        System.out.println(arrayList2.get(0));



    }
}
