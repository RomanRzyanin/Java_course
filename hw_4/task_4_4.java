import java.util.Deque;
import java.util.LinkedList;

public class task_4_4 {
    /**
     * Сдвиг очереди
     * Реализуйте метод rotateDeque в классе DequeTasks, который принимает
        Deque<Integer> и число n. Метод должен повернуть очередь вправо на n
        позиций. Если n отрицательное, повернуть влево.
     */
    public static void main(String[] args) {

        Deque<Integer> deque = new LinkedList<>();
            
        deque.add(1);
        deque.add(2);
        deque.add(3);
        deque.add(4);
        deque.add(5);
        deque.add(6);
        deque.add(7);

        int n = -3;
        System.out.println("Исходный deque " + deque);
        System.out.print("Deque со сдвигом на " + n + " позиций ");
        rotateDeque(deque, n);
        
    }
    public static void rotateDeque(Deque<Integer> deque, int n) {
        //if (deque.isEmpty()) return;
        int size = deque.size();
        n = n % size;
            if (n < 0) {
                n += size;
            }
            for (int i = 0; i < n; i++) {
                deque.addLast(deque.removeFirst());
            }
        System.out.println(deque);
    }
}



