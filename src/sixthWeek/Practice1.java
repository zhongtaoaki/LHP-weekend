package sixthWeek;

import java.util.ArrayList;
import java.util.List;

public class Practice1 {

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }

}

class Stack {

    private List<Integer> list = new ArrayList<>();

    public Integer pop() {
        if (list.size() == 0) {
            return null;
        }
        return list.remove(list.size()-1);
    }

    public void push(Integer i) {
        list.add(i);
    }

}