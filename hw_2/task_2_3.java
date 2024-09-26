/* Задача 3. Удаление пустых строк из текста
Дана строка с несколькими строками текста, разделенными переводами строки.
Напишите метод, который удаляет все пустые строки из текста */

import java.util.Scanner;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;


public class task_2_3 {
    public static void main(String[] args)  {
        System.out.print("Введите название файла: ");
        Scanner sc = new Scanner(System.in);
        String fileName = sc.next();
        sc.close();
        try{
        System.out.println("Информация исходного файла\n" + readFile(fileName));
        System.out.println("Удалены пустые строки из текста");
        System.out.println(removeEmptyLines(readFile(fileName)));
        }catch (Exception e) {
            System.out.println("The file was not found");
        }
        finally{
            System.out.println("Good bye");
        }
    }

    public static String readFile(String fileName) throws IOException {
        Scanner scanner = new Scanner(Paths.get(fileName), StandardCharsets.UTF_8.name());
        //здесь мы можем использовать разделитель, например: "\\A", "\\Z" или "\\z" ???????
        String data = scanner.useDelimiter("\\A").next();
        scanner.close();
        return data;
    }

    public static String removeEmptyLines(String text) {
        String[] lines = text.split("\n");
        StringBuilder cleanedText = new StringBuilder();
        for (String line : lines) {
            if (!line.trim().isEmpty()) {
                if (cleanedText.length() > 0) {
                    cleanedText.append("\n");
                }
                cleanedText.append(line);
            }
        }
        return cleanedText.toString();
             
    }

}
