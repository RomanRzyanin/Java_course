import java.util.Scanner;

public class task_3 {
    public static void main(String[] args) {
        System.out.println("Домашнее задание №3 к семинару 1.\nПодсчет суммы чифр числа n.");
        System.out.print("Введите число n = ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int m = n;
        int res = 0;
        
        while(n != 0){
            res += n % 10;
            n = n / 10;
        }
        
        System.out.println("Сумма цифр числа " + m + " = " + res);

    }
}