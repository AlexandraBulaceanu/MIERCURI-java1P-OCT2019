import java.util.*;
public class Exemplu7{
    public static void main(String [] args){
        
        Locale loc1 = new Locale("en");
        Locale loc2 = new Locale("en","US");
        //en_CA
        //fr_CA
        Locale loc3 = new Locale.Builder()
                                .setLanguage("en")
                                .setRegion("US")
                                .build();
        Locale loc4 = Locale.GERMANY;
    }
}