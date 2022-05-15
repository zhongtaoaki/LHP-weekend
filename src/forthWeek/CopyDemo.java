package forthWeek;

public class CopyDemo {

    public static void main(String[] args) throws CloneNotSupportedException {
        
        Fraction f1 = new Fraction(1, 3); // 1/3

        Fraction f2 = (Fraction)f1.clone();

        System.out.println(f2);

        f1.numerator = 2;
        System.out.println(f2);

        int[] array1 = {1,2,3};
        int[] array2 = array1.clone();
        int[] array3 = new int[3];

        for (int i = 0; i < array3.length; i++) {
            array3[i] = array1[i];
        }

        array1[0] = 9;
        System.out.println(array2[0]);
        System.out.println(array3[0]);

     

    }

}
