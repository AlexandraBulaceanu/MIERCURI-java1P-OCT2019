import java.util.*;
import java.util.stream.*;
public class Exemplu13{
    public static void main(String [] args){
        List<Produs> list = Arrays.asList(
            new Produs("sampon","igiena",11,60),
            new Produs("bere","bauturi",7.5,100),
            new Produs("sandwitch","hrana",12,5657),
            new Produs("pizza","hrana",34.8,90),
            new Produs("sapun","igiena",3.2,567)
        
        );
        Map<String,List<Produs>> res = list.stream()
                                           .collect(Collectors.groupingBy(p->p.categorie));
        System.out.println(res);
        Map<String,Long> res1 = list.stream()
                                           .collect(Collectors.groupingBy(p->p.categorie,Collectors.counting()));
        System.out.println(res1);
        
        
        
        
                               
                               
         
    }
}