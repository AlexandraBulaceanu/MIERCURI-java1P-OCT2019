import java.nio.file.*;
public class Exemplu10{
    public static void main(String [] args){
        Path p1 = Paths.get("A/B/C/D");
        Path p2 = Paths.get("A/B/X/Y");
        Path p3 = p1.relativize(p2);
        System.out.println(p3);
    }
}