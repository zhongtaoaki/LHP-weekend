package forthWeek;

public class StringDemo extends Object {

    public static void main(String[] args) {

        Student[] students = new Student[5];
        students[0] = new Student(1, "satou", 90);
        students[1] = new Student(2, "suzuki", 92);
        students[2] = new Student(3, "tanaka", 90);
        students[3] = new Student(4, "kojima", 60);
        students[4] = new Student(5, "nomura", 60);

        // 90 ,92, 90, 60, 60
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 1; j < students.length - i; j++) {
                if (students[i].equals(students[i + j])) {
                    System.out.println(students[i]);
                    System.out.println(students[i + j]);
                }
            }
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

        Student other = (Student) obj;

        return other.grade == this.grade;
    }

}
