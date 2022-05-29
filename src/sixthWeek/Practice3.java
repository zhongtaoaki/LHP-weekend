package sixthWeek;

import java.util.ArrayList;
import java.util.List;

public class Practice3 {
    
    public static void main(String[] args) {
        
        List<Student> students = new ArrayList<>();
        students.add(new Student("satou", 80));
        students.add(new Student("suzuki", 92));
        students.add(new Student("tanaka", 34));
        students.add(new Student("kojima", 59));
        students.add(new Student("matsumura", 60));
        students.add(new Student("yamasita", 61));
        students.add(new Student("tomiyama", 90));
        students.add(new Student("izumi", 100));

        //把及格的学生按照分数从高到低排序输出
    }
}


class Student{
    public String name;
    public int score;
    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
    @Override
    public String toString() {
        return "name: " + name + ", score: " + score;
    }
    
}