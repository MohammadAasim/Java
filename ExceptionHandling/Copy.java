package ExceptionHandling;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.io.*;

public class Copy {
    public static void main(String[] args) throws IOException {
        try{
            Path p1 = Paths.get("C:\\Users\\Aasim\\Desktop\\Temp\\copy.docx");
            List<String> data = Files.readAllLines(p1);
            for(String str : data){
                System.out.println(str);
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}