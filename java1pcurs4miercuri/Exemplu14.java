import java.util.*;
import java.util.stream.*;
public class Exemplu14{
    public static void main(String [] args){
        List<String> list = Arrays.asList("Iasi","Cluj","Brasov","Timisoara");
        Map<Integer,List<String>> rez=list.stream()
                                       .collect(Collectors.groupingBy(s->s.length()));
        System.out.println(rez);
        Map<Boolean,List<String>> map = list.stream()
                                            .collect(Collectors.partitioningBy(s->s.length()%2==0));
         System.out.println(map);                                 
    }
}