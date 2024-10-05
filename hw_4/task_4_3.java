import java.util.LinkedList;
/**
 * Количество вхождений слова
 */
public class task_4_3 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("apple");
        ll.add("banana");
        ll.add("pear");
        ll.add("apple");
        ll.add("orange");
        ll.add("mango");
        ll.add("apple");

        String value = "apple";
   
        System.out.print("Исходный LinkedList: ");
        System.out.println(ll);
        System.out.print("Количество вхождений слова '" + value + "' = " + countOccurrences(ll, value));
    }

    public static int countOccurrences(LinkedList<String> list, String value){
        int cnt = 0;
        for (String string : list) {
            if (string == value) {
                cnt++;
            }
        }
        return cnt;
    }

}
