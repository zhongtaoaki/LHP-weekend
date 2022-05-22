package fifthWeek;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");
        arrayList.add("d");
        arrayList.add("e");
        arrayList.add("f");
        arrayList.add(3,"i");

        // for (String string : arrayList) {
        //     System.out.println(string);
        // }

        arrayList.set(0, "z");
        arrayList.remove(3);
        System.out.println(arrayList.size());

        for (int i = 0; i < arrayList.size(); i++) {
             System.out.println(arrayList.get(i));
        }


        


    }
}
