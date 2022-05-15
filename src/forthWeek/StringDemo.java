package forthWeek;

public class StringDemo extends Object {

    public static void main(String[] args) {

        Student s1 = new Student(1, "satou", 90);
        System.out.println(s1);

        Student[] students = new Student[5];
        //90 ,92, 90, 60, 60
        for (Student student : students) {
         
        }
    }
}

class Student {

    private int number;
    private String name;
    private int grade;

    public Student(int number, String name, int grade) {
        this.number = number;
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "学号：" + this.number + "， 姓名：" + this.name + "，成绩：" + this.grade;
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }
}
