package forthWeek;

public class ThisDemo {
    

    public static void main(String[] args) {
        
        Animal animal = new Animal("dog");

        animal.printName();
    }

}

class Animal{

    String name;
    int age ;

    public Animal(){}

    public Animal(String name){
        this.name = "this animal's name is" + name;
    }

    public Animal(String name,int age){
        this(name);
        this.age = age;
    }

    @Override
    public String toString() {
        return this.name;
    }

    public void printName() {
        System.out.println(this.toString());
    }

}

class Cat extends Animal{

    @Override
    public String toString() {
        return super.toString();
    }

}
