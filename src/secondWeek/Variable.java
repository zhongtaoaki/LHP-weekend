package secondWeek;

public class Variable {
    
    static int add(int i){
        return i++;
    }

    public static void main(String[] args) {
        
        int i = 10;
        int j =  add(i);
        System.out.println(j);
    }
}
