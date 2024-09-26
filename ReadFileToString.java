
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
 
//import org.apache.commons.io.FileUtils;
 
// в этом классе показаны разные способы скопировать содержимое файла в строку
public class ReadFileToString {
 
    public static void main(String[] args) throws IOException {
        String fileName = "D:\\GeekBrains\\first year\\Java\\Java_course\\hw_2\\text.txt";
         
        // читаем файл с помощью Scanner
        String contents = readUsingScanner(fileName);
        
        // считываем содержимое файла с помощью Apache Commons IO
        //contents = readUsingApacheCommonsIO(fileName);
         
        // читаем файл в строку с помощью класса Files
        contents = readUsingFiles(fileName);
         
        // считываем содержимое файла в String с помощью BufferedReader
        contents = readUsingBufferedReader(fileName);
        System.out.println(contents);
        System.out.println(contents.length());
    }
 
    // считываем содержимое файла в String с помощью BufferedReader
    private static String readUsingBufferedReader(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader( new FileReader (fileName));
        String line = null;
        StringBuilder stringBuilder = new StringBuilder();
        String ls = System.getProperty("line.separator");
        while( ( line = reader.readLine() ) != null ) {
            stringBuilder.append( line );
            stringBuilder.append( ls );
        }
        
        stringBuilder.deleteCharAt(stringBuilder.length()-1);
        return stringBuilder.toString();
    }
 
    // читаем файл в строку с помощью класса Files
    private static String readUsingFiles(String fileName) throws IOException {
        return new String(Files.readAllBytes(Paths.get(fileName)));
    }
 
    // считываем содержимое файла с помощью Apache Commons IO
    // private static String readUsingApacheCommonsIO(String fileName) throws IOException {
    //     return FileUtils.readFileToString(new File(fileName), StandardCharsets.UTF_8);
    // }
 
    // читаем файл с помощью Scanner
    private static String readUsingScanner(String fileName) throws IOException {
        Scanner scanner = new Scanner(Paths.get(fileName), StandardCharsets.UTF_8.name());
        //здесь мы можем использовать разделитель, например: "\\A", "\\Z" или "\\z"
        String data = scanner.useDelimiter("\\A").next();
        scanner.close();
        return data;
    }
 
}

