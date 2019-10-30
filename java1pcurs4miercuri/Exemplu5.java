import java.time.*;
public class Exemplu5{
    public static void main(String [] args){
        
       // ZoneId.getAvailableZoneIds().forEach(System.out::println);
        ZoneId.getAvailableZoneIds()
              .stream()
              .filter(z->z.contains("Europe"))
              .forEach(System.out::println);
        
        
        
        
        
    }
}