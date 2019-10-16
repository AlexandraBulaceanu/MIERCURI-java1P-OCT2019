import java.nio.file.*;
public class Exemplu7{
    public static void main(String [] args){
        Path p1 = Paths.get("A/B/C");
        Path p2 = Paths.get("A","B","C");
        Path p3 = Paths.get("C:/A/B/C");
        System.out.println(p1.getClass());
        System.out.println(p3.getClass());
        System.out.println(p1.getFileName());
        System.out.println(p1.getRoot());
        System.out.println(p3.getRoot());
        System.out.println(p1.getParent());
        System.out.println(p3.getParent());
    }
}