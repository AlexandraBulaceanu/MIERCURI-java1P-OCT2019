//Registry Pattern
import java.util.*;
public class ProdusRegistry{
    public static enum ProdusType{
        
        DULCE, SARAT
    }
    private static Map<ProdusType,Produs> registry = new HashMap<>();
    public static Produs getInstance(ProdusType type){
        if(!registry.containsKey(type)){
            registry.put(type,new Produs());
        }
        return registry.get(type);
    }
}