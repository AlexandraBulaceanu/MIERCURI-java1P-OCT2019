import java.util.*;
import java.util.stream.*;
public class Exemplu10{
    public static void main(String [] args){
        List<Integer> list = Arrays.asList(3,7,5,9,2);
        List<Integer> rez = list.stream()
                                .map(v->v*v)
                                .collect(Collectors.toList());
        System.out.println(rez);
        System.out.println(list);
        ArrayList<Integer> res2 = list.stream()
                                      .map(nr->nr*5)
                                      .collect(Collectors.toCollection(ArrayList::new));
        //()->new ArrayList<>()
    }
}