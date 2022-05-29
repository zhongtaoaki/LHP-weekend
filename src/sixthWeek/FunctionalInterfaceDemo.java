package sixthWeek;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {

        List<Integer> list = List.of(1, 20, 3, 4, 15, 65, 76);

        // list.forEach(consumer);
        // list.forEach(t -> System.out.println(t));
        // list.forEach(System.out::println);

        Consumer consumer;// 有一个参数，没有返回值
        Function function;// 有一个参数，有返回值
        Supplier supplier;// 没有参数，有返回值
        Predicate predicate;// 有参数，有返回值，且返回值为Boolean

        Comparator comparator;// 表达比较，有2个参数，有返回值 是int

        list.stream().filter(i -> i > 5).sorted((t1, t2) -> t2 - t1).forEach(System.out::println);

    }
}


