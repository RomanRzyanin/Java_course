/* Задача 3. Длина слов
Реализуйте метод, который принимает на вход массив строк и возвращает
новый массив, содержащий только строки, длина которых больше 3 символов. */

import java.util.ArrayList;

public class task_3_3 {public static void main(String[] args) {
        //System.out.println("Hello");
        String[] a = {"cat", "elephant", "dog", "giraffe"};
        System.out.print("Исходный массив: ");
        printArray(a);
        System.out.print("Отфильтрованный массив: ");
        printArray(filterArr(a));
    }
    public static String[] filterArr(String[] arr) {
        ArrayList<String> res = new ArrayList<>();
        for (String el : arr) {
            if (el.length() > 3) {
                res.add(el);
            }
        }
    
        String[] result = new String[res.size()];
        for (int i = 0; i < res.size(); i++) {
            result[i] = res.get(i);
        }
    return result;
    }
    public static void printArray(String[] arr){
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
