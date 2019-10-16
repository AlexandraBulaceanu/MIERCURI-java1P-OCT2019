import java.io.*;
import java.nio.file.*;
public class Exemplu14{
    public static void main(String [] args){
        Path p1 = Paths.get("Exemplu14.java");
        Path p2 = Paths.get("alt_path.txt");
        try{
            Files.copy(p1,p2);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}