import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        System.out.println("Домашнее задание №1 к семинару 1.\nНахождение факториала числа n.");
        System.out.print("Введите число n = ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n < 0){
            System.out.println("n! = -1");
        }
        else if(n == 0){
            System.out.println("n! = 1");
        }
        else {
            double res = factorial(n);
            System.out.println("n! = " + res);
        }
        sc.close();
    }
    public static double factorial(int n){
        if (n == 1){
            return 1;
        }
        return n * factorial(n - 1);
    }
}
