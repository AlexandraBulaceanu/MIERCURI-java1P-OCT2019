import java.util.concurrent.*;
public class Exemplu2{
    public static void main(String [] args){
        ForkJoinPool pool = new ForkJoinPool();
        FibboTask task = new FibboTask(8);
        Integer rez = pool.invoke(task);
        System.out.println(rez);
    }
}