import java.util.Scanner;

public class task_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your name:  ");

        String name = sc.next();

        if(name.startsWith("A")){
            System.out.println("Are you Alex?");
        }
        else{
            System.out.println("You aren't Alex");
        }

        System.out.println("Hello " + name + "!");
    }
}
