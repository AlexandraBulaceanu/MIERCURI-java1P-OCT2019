//Afisati al n-lea termen din sirul Fibbonaci
import java.util.concurrent.*;
public class FibboTask extends RecursiveTask<Integer>{
    private Integer n;
    public FibboTask(Integer n){
        
        this.n = n;
    }
    public Integer compute(){
        if(n<=1) {
            return n; // conditia de oprire a recursivitatii
        }
        FibboTask f1 = new FibboTask(n-1);
        FibboTask f2 = new FibboTask(n-2);
        //am impartit problema mare in 2 subtask-uri = f1 si f2
        f1.fork();//acum se realizeaza in paralel f1
        return f1.join() + f2.compute();
        //f1.join() -> f2 va astepta rezultatele ce vin de la f1(deoarece f1 este instanta din care am dereferentiat)
        //f2.compute() -> se va realiza autoapelul din f2, dupa ce voi avea rezultatele de la celalalt fir de executie
    }
}