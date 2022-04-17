package firstWeek;

/**
 * 变量的使用：
 * 在方法内部声明的变量，在方法内部可以直接使用变量名的方式来调用
 * 
 * 使用赋值符号改变变量的值
 * 
 * 运算符
 * 算数运算符 +-*"/"%
 * 赋值运算符 = ,+= -= /= *= %= ++ --
 * 比较运算符 ==,>,<,<=,>=,!=
 * 条件运算符 &,|,!,&&,||
 * 
 */
public class TokenDemo {
    
    public static void main(String[] args) {
        
        int number  = 1;

        //System.out.println(++number);
        // System.out.println(number++);
        // System.out.println(number);

        number = number +1;

        int i = number++;
        int j = ++number;

        System.out.println(i);
        System.out.println(number);

        boolean a = true;
        boolean b = false;

        System.out.println(a && b); // false
        System.out.println(b || a); // true
        System.out.println(a && !b);
        System.out.println(a && b || b );
        System.out.println((a && b) || (a || b)); //false || true
    }
}
