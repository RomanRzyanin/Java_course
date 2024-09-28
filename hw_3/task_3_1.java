/* Задание 1. Удаление отрицательных значений из массива
Реализуйте метод, который принимает на вход целочисленный массив и
удаляет все отрицательные числа. Метод должен вернуть массив, содержащий
только неотрицательные числа. */

import java.util.ArrayList;
//import java.util.Arrays;

public class task_3_1{
    public static void main(String[] args) {
        //System.out.println("Hello");
        int[] a = {-1, 2, -3, 4, -5, 6, 0, -67, -23, 567};
        System.out.print("Исходный массив: ");
        printArray(a);
        System.out.print("Отфильтрованный массив: ");
        printArray(filterArr(a));
    }
    public static int[] filterArr(int[] arr) {
        ArrayList<Integer> res = new ArrayList<>();
        for (int el : arr) {
            if (el >= 0) {
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



