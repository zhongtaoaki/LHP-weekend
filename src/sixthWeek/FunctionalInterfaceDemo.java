package sixthWeek;

import java.util.List;
import java.util.function.Consumer;

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {

        Consumer consumer = new Consumer<Integer>() {
            public void accept(Integer t) {
                System.out.println(t);
            }
        };

        List<Integer> list = List.of(1,2,3,4,5,65,76);
        
        //list.forEach(consumer);
        list.forEach((Integer t) -> {
            System.out.println(t);
        });
        
    }
}
