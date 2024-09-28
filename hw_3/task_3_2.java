/* Задача 2. Уникальные числа
Напишите метод, который принимает целочисленный массив и возвращает
новый массив, содержащий только уникальные элементы из исходного
массива.  */

import java.util.ArrayList;

public class task_3_2 {
    public static void main(String[] args) {
        int[] a  = {0, 1, 2, 2, 2, 3, 4, 5, 5, 5, 5, 6, 7, 7, 8, 9, 5};
        System.out.print("Исходный массив: ");
        printArray(a);
        System.out.print("Отфильтрованный массив: ");
        printArray(filterArr(a));
    }

    public static int[] filterArr(int[] arr) {
        ArrayList<Integer> res = new ArrayList<>();
        for (int el : arr) {
            if (!res.contains(el)) {
                res.add(el);
            }
        }
    
        int[] result = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            result[i] = res.get(i);
        }
        return result;
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


