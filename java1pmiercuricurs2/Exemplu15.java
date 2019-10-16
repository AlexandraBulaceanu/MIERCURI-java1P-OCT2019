import java.nio.file.*;
import java.io.*;
public class Exemplu15{
    public static void main(String [] args){
        Path p = Paths.get("Exemplu15.java");
        try(BufferedReader in = Files.newBufferedReader(p)){
            String line = null;
            while((line=in.readLine())!=null){
                System.out.println(line);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}