import java.time.*;
public class Exemplu3{
    public static void main(String [] args){
        /**
         
           * java.util.Date->legacy
         */
        LocalDate d1 = LocalDate.now();//timpul la care rulez
        LocalDate d2 = LocalDate.of(2045,6,12);
        
        LocalDate d3 = LocalDate.of(2017,Month.OCTOBER,13);
        //LocalDate d4 = LocalDate.of(1995,4,98);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        //System.out.println(d4);
        //2017-10-20
        
        
        
        
    }
}