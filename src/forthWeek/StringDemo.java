package forthWeek;

public class StringDemo extends Object{
    
    public static void main(String[] args) {
        
        Fraction f1 = new Fraction(1, 3);

        System.out.println(f1);

        Student s1 = new Student(1, "satou", 90);
        System.out.println(s1);
        // 学号：1， 姓名：satou，成绩：90
    }

}

class Student{
    
    private int number;
    private String name;
    private int grade;

    public Student(int number, String name,int grade){
        this.number = number;
        this.name = name;
        this.grade = grade;
    }
}
