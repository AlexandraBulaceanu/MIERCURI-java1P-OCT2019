import java.nio.file.*;
public class Exemplu9{
    public static void main(String [] args){
        Path p1 = Paths.get("A/B");
        Path p2 = Paths.get("C/D");
        Path rez = p1.resolve(p2);//relativa+relativa
        System.out.println(rez);
        Path p3 = Paths.get("C:/A/B");
        Path rez2 = p3.resolve(p2);//absoluta+relativa
        System.out.println(rez2);
        Path rez3 = p2.resolve(p3);//relativa+absoluta
        System.out.println(rez3);
        //rez si rez2 -> fac concatenare
        //rez3 -> imi intoarce calea absoluta, fara concatenare
    }
}