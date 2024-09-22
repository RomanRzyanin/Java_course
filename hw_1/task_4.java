import java.util.Scanner;

public class task_4 {
    public static void main(String[] args) {
        System.out.println("Домашнее задание №4 к семинару 1.\nНахождение максимального из трех чисел.");
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число a = ");
        int a = sc.nextInt();
        System.out.print("Введите число b = ");
        int b = sc.nextInt();
        System.out.print("Введите число c = ");
        int c = sc.nextInt();
        sc.close();
        System.out.println("Максимальное из чисел " + a + " , " + b + " , " + c + " равно " + findMax(a, b, c));

    }
    public static int findMax(int a, int b, int c) {
        int max = a > b ? a : b;
        int maxRes = c > max ? c : max; 
        return maxRes;    
    }
}
