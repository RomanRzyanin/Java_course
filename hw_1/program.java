// import java.time.LocalDateTime;
// import java.time.LocalTime;
// import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {

        System.out.println("Домашнее задание к семинару 1.\n");
        System.out.println("Выберите задачу которую надо решить:\n1) Нахождение факториала n!.\n2) Вывод все четных чисел от 1 до 100.\n3) Подсчет суммы цифр числа.\n4) Нахождение максимального числа.");
        System.out.println("Введите число от 1 до 4");

        Scanner sc = new Scanner(System.in);
        while (true){
            String num = sc.next();
            if (num.startsWith("q")){
                System.exit(0);
            }
            if (num.startsWith("1")){
                //task1
            }
            else if (num == "2"){
                //task2
            }
            else if (num == "3"){
                //task3
            }
            else if (num == "4"){
                //5task4
            }
            else{
                System.out.println("Вы ввели не верное число, введите число от 1 до 4. Для выхода нажмите 'q'");
            }
            //    
        }
        
        //num.close();

        // System.out.println("Hello world!");

        // LocalTime now = LocalTime.now(); 

        // DateTimeFormatter formatter = DateTimeFormatter.ofPattern(null);
        
        // System.out.println(now);
        // System.out.println(formatter.format(LocalDateTime.now())); 
    }

}


// public static void main(String[] args) {

//     Scanner sc = new Scanner(System.in);

//     System.out.println("Please enter your name:  ");

//     String name = sc.next();

//     if(name.startsWith("A")){
//         System.out.println("Are you Alex?");
//     }
//     else{
//         System.out.println("You aren't Alex");
//     }

//     System.out.println("Hello " + name + "!");