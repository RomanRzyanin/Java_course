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
                factorial();
            }
            else if (num.startsWith("2")){
                task_2();
            }
            else if (num.startsWith("3")){
                task_3();
            }
            else if (num.startsWith("4")){
                task_4();
            }
            else{
                System.out.println("Вы ввели не верное число, введите число от 1 до 4. Для выхода нажмите 'q'");
            }
            // sc.close();                  
        }
     
    }




public static int factorial(int n) {

    System.out.println("Нахождение факториала числа n!");
    System.out.print("Введите число n = ");
    Scanner sc = new Scanner(System.in);
    int m = sc.nextInt();
    if (n < 0){
        System.out.println(n + "! = -1");
    }
    else if(n == 0 || n == 1){
        System.out.println(n + "! = 1");
    }
    else{
        int res = n * factorial(n - 1);
        System.out.println();
    }

    //sc.close();


}


private static void task_2() {

    System.out.println("Это задача 2");
}



private static void task_3() {

    System.out.println("Это задача 3");
}



private static void task_4() {

    System.out.println("Это задача 4");
}
}
