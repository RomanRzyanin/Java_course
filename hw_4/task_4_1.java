import java.util.LinkedList;
/*
Удаление нечетных строк
Дан LinkedList с несколькими элементами. В методе
removeOddLengthStrings класса LLTasks реализуйте удаление строк, длина
которых нечетная. Используйте LinkedList и стандартные методы.
 */
public class task_4_1 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        //if (args.length == 0) {
            ll.add("apple");
            ll.add("banana");
            ll.add("pear");
            ll.add("grape");
            ll.add("orange");
            ll.add("mango");
        //} 
        // else {
        //     for (String arg : args) {
        //         ll.add(arg);
        //     }
        // }
        System.out.print("Исходный LinkedList: ");
        System.out.println(ll);
        System.out.print("Удалены элементы с нечетной длиной: ");
        removeOddLengthStrings(ll);;
    }

    public static void removeOddLengthStrings(LinkedList<String> ll){
    LinkedList<String> toRemove = new LinkedList<>();
    for (String s : ll) {
        if (s.length() % 2 != 0) {
            toRemove.add(s);
        }
    }
    ll.removeAll(toRemove);
    System.out.println(ll);    
    }
}

