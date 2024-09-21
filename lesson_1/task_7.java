import java.io.FileWriter;
import java.io.IOException;

public class task_7 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("output.txt");
        fw.write("Hello world!");
        fw.flush();
        fw.close();
    }

}
