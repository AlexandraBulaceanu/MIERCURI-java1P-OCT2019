import java.nio.file.*;
import java.io.*;
public class Exemplu13{
    public static void main(String [] args){
        Path p1 = Paths.get("exempluFile");
        Path p2 = Paths.get("MyFolder");
        try{
            if(Files.exists(p2)) {
                Files.delete(p2);
                //NoSuchFileException->vreau sa sterg ceva ce nu exista
            }
            //Files.deleteIfExists(p2);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}