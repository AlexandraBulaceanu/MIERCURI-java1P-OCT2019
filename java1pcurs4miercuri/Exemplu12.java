import java.util.*;
import java.util.stream.*;
public class Exemplu12{
    public static void main(String [] args){
        List<Produs> list = Arrays.asList(
            new Produs("sampon","igiena",11,60),
            new Produs("bere","bauturi",7.5,100),
            new Produs("sandwitch","hrana",12,5657),
            new Produs("pizza","hrana",34.8,90),
            new Produs("sapun","igiena",3.2,567)
        
        );
        Double pretMediu = list.stream()
                               .collect(Collectors.averagingDouble(p->p.pret));
                               
        System.out.println(pretMediu);                       
                               
                               
         
    }
}