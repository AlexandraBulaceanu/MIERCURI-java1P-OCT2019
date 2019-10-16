import java.nio.file.*;
public class Exemplu8{
    public static void main(String [] args){
        Path p1 = Paths.get("C:/A/B/C/D/E");
        for(int i=0;i<p1.getNameCount();i++){
            System.out.println(p1.getName(i));
        }
        Path sp = p1.subpath(1,3);
        System.out.println(sp);
    }
}