package fifthWeek;

public class WrapperDemo {

    public static void main(String[] args) {

        Integer integer1 = 128;
        Integer integer2 = 128;

        int i = 1000;
        int j = 1000;

        System.out.println(i == j);
        System.out.println(integer1 == integer2);

        Integer integer3 = Integer.valueOf("12");
        System.out.println(integer3);

    }
}
