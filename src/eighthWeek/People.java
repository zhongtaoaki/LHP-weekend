package eighthWeek;

import java.time.LocalDate;
import java.time.Period;

public class People implements Comparable{

    public String name;
    //public String birthday;// "20000612"
    public LocalDate birthday;

    public People(String name, LocalDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    // 20220612
    public int getAge() {

        // int age = 2022 - Integer.parseInt(birthday.substring(0, 4));
        // if (Integer.parseInt(birthday.substring(4)) > 612) {
        //     age--;
        // }
        // return age;

        return Period.between(birthday, LocalDate.now()).getYears();
    }

    @Override
    public boolean equals(Object obj) {
        People people = (People)obj;
        return this.name.equals(people.name) && this.getAge() == people.getAge();
    }

    @Override
    public int compareTo(Object o) {
        People people = (People)o;
        return this.getAge() - people.getAge();
    }

    public static void main(String[] args) {

        People people1 = new People("satou", LocalDate.of(2001, 6, 12));
        People people2 = new People("satou", LocalDate.of(2000, 6, 12));

        System.out.println(people1.equals(people2));
        System.out.println(people1.compareTo(people2));
    }

}
