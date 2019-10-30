import java.time.*;
public class Exemplu4{
    public static void main(String [] args){
        LocalDateTime lt1 = LocalDateTime.now();
        LocalDateTime lt2 = LocalDateTime.of(2017,10,20,10,30);
        LocalDateTime lt3 = LocalDateTime.of(2019,10,30,19,23,50);
        LocalDate d1 = LocalDate.of(2020,5,16);
        LocalTime t1 = LocalTime.of(21,50);
        LocalDateTime lt4 = LocalDateTime.of(d1,t1);
        //2017-10-20T10:50
        System.out.println(lt1);
        System.out.println(lt2);
        System.out.println(lt3);
        System.out.println(lt4);
        
        
        
        
    }
}