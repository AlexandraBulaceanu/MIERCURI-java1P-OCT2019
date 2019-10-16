import java.nio.file.*;
public class Exemplu11{
    public static void main(String [] args){
        Path p1 = Paths.get("A/B/C./../../././X/Y/Z../../Q/W/./E");
        Path p2 = p1.normalize();
        System.out.println(p2);
        
        //A/X/Y/Q/W/E
    }
}