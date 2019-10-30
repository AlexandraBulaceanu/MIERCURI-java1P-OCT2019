import java.util.*;
import java.util.stream.*;
public class Exemplu9{
    public static void main(String [] args){
        
        List<String> list = Arrays.asList("rosu","galben","albastru","verde");
        String rez = list.stream()
                         .map(s->String.valueOf(s.length()))
                         .collect(Collectors.joining(","));
        System.out.println(rez);
    }
}