import java.io.*;
import java.nio.file.*;
import java.util.*;
public class Exemplu16{
    public static void main(String [] args){
        Path p = Paths.get("Exemplu15.java");
        try{
            List<String> lines = Files.readAllLines(p);
            lines.forEach(System.out::println);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}