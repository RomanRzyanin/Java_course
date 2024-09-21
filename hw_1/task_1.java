import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class task_1 {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        LocalTime now = LocalTime.now(); 

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(null);
        
        System.out.println(now);
        System.out.println(formatter.format(LocalDateTime.now()));                                                                                                                      
    }
}
