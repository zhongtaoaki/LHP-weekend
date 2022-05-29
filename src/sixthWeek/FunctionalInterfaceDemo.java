package sixthWeek;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {

        List<Integer> list = List.of(1, 2, 3, 4, 5, 65, 76);

        // list.forEach(consumer);
        // list.forEach(t -> System.out.println(t));
        // list.forEach(System.out::println);

        Consumer consumer;// 有一个参数，没有返回值
        Function function;// 有一个参数，有返回值
        Supplier supplier;// 没有参数，有返回值
        Predicate predicate;// 有参数，有返回值，且返回值为Boolean

        list.stream().filter(i -> i > 10).forEach(System.out::println);

    }
}
