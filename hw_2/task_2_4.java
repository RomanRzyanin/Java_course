/* Задача 4. Логирование операций с массивом во время поиска
минимального и максимального элементов
Реализуйте метод поиска минимального и максимального элементов массива.
После нахождения каждого элемента (минимального и максимального),
сделайте запись в лог-файл log.txt в формате год-месяц-день
час:минуты {минимальный элемент}, {максимальный элемент}. */

import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.File;
import java.io.IOException;



public class task_2_4 {
    public static void main(String[] args) throws Exception {
        
        int arr[] = {1, 3, 4, 5, 6, 7, 3, 12, 14, 636, -45};
        //System.out.println(findMinMax(arr)[0] + "  " + findMinMax(arr)[1]);
        logStep(findMinMax(arr)[0], findMinMax(arr)[1]);


    }

    public static int[] findMinMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        int[] res = new int[2];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        res[0] = min;
        res[1] = max;
        return res;
    }    

    public static void logStep(int min, int max) throws Exception {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
            String timestamp = dateFormat.format(new Date());
            File log = new File("D:\\GeekBrains\\first year\\Java\\Java_course\\hw_2\\log.txt");
            log.createNewFile();
            FileWriter fileWriter = new FileWriter(log);
            fileWriter.write(timestamp + " " + min + ", " + max +  "\n");
            fileWriter.close();
            } catch (IOException e) {
            e.printStackTrace();
            }
    }
    
}

