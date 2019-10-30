import java.time.*;
public class Exemplu6{
    public static void main(String [] args){
        ZonedDateTime zd1 = ZonedDateTime.now();
        ZonedDateTime zd2 = ZonedDateTime.now(ZoneId.of("Europe/London"));
        System.out.println(zd1);
        System.out.println(zd2);
        
    }
}