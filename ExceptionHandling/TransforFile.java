package ExceptionHandling;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;

public class TransforFile {
    public static void main(String[] args) {
        try{
            System.out.println("Start :-"+new Date());
            Path source = Paths.get("C:\\Users\\Aasim\\Desktop\\Temp\\copy.docx");
            Path destination = Paths.get("C:\\Users\\Aasim\\Desktop\\Temp\\D\\copy2.docx");
            System.out.println("End :-"+new Date());
            Files.copy(source,destination);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
