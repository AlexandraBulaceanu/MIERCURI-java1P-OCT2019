import java.time.*;
public class Exemplu2{
    public static void main(String [] args){
        /**
         
           * java.util.Date->legacy
         */
        LocalTime t1 = LocalTime.now();//timpul la care rulez
        LocalTime t2 = LocalTime.of(10,45);
        LocalTime t3 = LocalTime.of(15,23,20);
        LocalTime t4 = LocalTime.of(10,55,30,100);
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);
        //10:55:30
        //10:55
        //t1.minusMinutes(10);->rezultatul nu este salvat
        LocalTime rez1 = t1.minusMinutes(10);
        LocalTime rez2 = t1.plusMinutes(10);
        System.out.println(rez1);
        System.out.println(rez2);
        if(t1.isAfter(t2)) {System.out.println("Este dupa");}
        else {System.out.println("isBefore()");}
        
        
        
    }
}