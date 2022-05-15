package forthWeek;

/**
 * 基本数据类型 使用 == 比较值是否相等
 * 引用数据类型？数组，类，enum interface
 * 
 */
public class EqualsDemo extends Object{

    public static void main(String[] args) {
        
        Fraction i = new Fraction(1, 3);
        Fraction j = new Fraction(1, 3);

        //System.out.println(i.equals(j));

        int[] array1 = {1,2,3};
        int[] array2 = {1,2,3};

        String s1 = new String("HelloWorld");
        String s2 = new String("HelloWorld");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

    }
}
