import java.util.LinkedList;
/*
 * 
 */

public class task_4_2 {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        //LinkedList<String> stack = new LinkedList<>();
        
            // stack.add("apple");
            // stack.add("banana");
            // stack.add("pear");
            // stack.add("grape");
            // stack.add("orange");
            // stack.add("mango");

            stack.push("apple");
            stack.push("banana");
            stack.push("pear");
            stack.push("grape");

            //System.out.println(stack);

            System.out.println(stack.getElements());
            System.out.println(stack.pop());
            System.out.println(stack.getElements());
            System.out.println(stack.peek());
    }  
}  
class MyStack {
       
    private LinkedList<String> stack = new LinkedList<>();
        
    public void push(String element) {
        stack.addFirst(element);
    }
    public String pop() {
        return stack.removeFirst();
    }
    public String peek() {
        return stack.peekFirst();
    }
    public LinkedList<String> getElements() {
        return new LinkedList<>(stack);
    }
}





    


