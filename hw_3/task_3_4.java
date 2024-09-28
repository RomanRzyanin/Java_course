/* Задача 4*. Среднее значение массива
Напишите метод, который принимает массив целых чисел и возвращает
среднее значение элементов массива, округленное до ближайшего целого
числа. */


public class task_3_4 {
    public static void main(String[] args) {
    int[] a  = {155, 1, 2, 2, 2, 3, 4, 5, 5, 5, 5, 6, 7, 7, 8, 9, 5};
        System.out.print("Исходный массив: ");
        printArray(a);
        System.out.print("Среднее значение эл-тов массива: ");
        System.out.print(sumArrAverage(a));
    }

    public static int sumArrAverage(int[] arr) {
        int sum = 0;
        if (arr.length == 0){
            return 0;
            }
        else{
            for (int el : arr) {
                sum += el; 
            }
            
        return (int) Math.round((double) sum / arr.length);
        }
    }

    public static void printArray(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            
            if (i == arr.length - 1){
                System.out.println(arr[i] + "]\n");
            } 
            else{
                System.out.print(arr[i] + ", ");
            }
        }
    }

}
