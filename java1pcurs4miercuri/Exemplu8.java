import java.util.*;
public class Exemplu8{
    public static void main(String [] args){
        
        Locale loc = new Locale("ro","RO");
        Locale loc1 = new Locale("de","DE");
        Locale loc2 = new Locale("fr","FR");
        ResourceBundle bundle = ResourceBundle.getBundle("traduceri",loc);
        ResourceBundle bundle1 = ResourceBundle.getBundle("traduceri_de_DE",loc1);
        ResourceBundle bundle2 = ResourceBundle.getBundle("traduceri_fr_FR",loc2);
        String trad = bundle.getString("exit");
        String trad1 = bundle1.getString("iesire");
        String trad2 = bundle2.getString("iesire");
        System.out.println(trad);
        System.out.println(trad1);
        System.out.println(trad2);
        
    }
}