package ExceptionHandling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ExceptionH {
    public static void main(String[] args) throws IOException {
        Path p = Paths.get("C:\\Users\\Aasim\\Desktop\\Temp");
        System.out.println(p.getRoot());

        try {
            Stream<Path> str = Files.list(p);
            str.forEach(x->{
                String name = x.getFileName().toString();
                String token[] = name.split("\\.");
                String extension = token[token.length-1];
                try{
                    //Path d = Paths.get(x.getParent()+"\\"+extension);
                    Path d = Paths.get(extension);
                    Files.createDirectories(d);
                }
                catch (Exception e){
                    System.out.println(e);
                }
            });
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
