import java.util.Deque;
import java.util.LinkedList;

public class task_4_5 {
    /**
     * Удаление слова из очереди
        Реализуйте метод removeAllOccurrences в классе DequeTasks, который
        принимает Deque<String> и строку value. Метод должен удалить все
        вхождения строки value из очереди.
     */
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<>();
        deque.add("apple");
        deque.add("banana");
        deque.add("pear");
        deque.add("apple");
        deque.add("orange");
        deque.add("mango");
        deque.add("apple");

        String value = "apple";
        System.out.println(deque);
        removeAllOccurrences(deque, value);
    }
    public static void removeAllOccurrences(Deque<String> deque,String value) {
        deque.removeIf(element -> element.equals(value));
        System.out.println(deque);
    }
}
