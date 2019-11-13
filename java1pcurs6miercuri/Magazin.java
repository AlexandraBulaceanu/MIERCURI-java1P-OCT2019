import java.util.*;
import java.util.stream.*;
public class Magazin{
    //private static Magazin instance = new Magazin();
    //eager singleton
    
    private String nume;
    private List<Produs> produse;
    public String getNume(){
        return this.nume;
    }
    public List<Produs> getProduse(){
        return this.produse.stream().collect(Collectors.toList());
    }
    //lazy singleton
    private static Magazin instance;
    private Magazin(){
    }
    public static Magazin getInstance(){
        if(instance == null){
            instance = new Magazin();
        }
        return instance;
    }
    //Double-Checking = are doua if-uri identice
    public static Magazin getInstance2(){
        if(instance == null){
            synchronized(Magazin.class){
                if(instance==null){
                    instance = new Magazin();
                }
            }
        }
        return instance;
    }
    //inner statica
    private static class MagazinHolder{
        private static final Magazin instance = new Magazin();
    }
    public static Magazin getInstance3(){
        return MagazinHolder.instance;
    }
    
    
}