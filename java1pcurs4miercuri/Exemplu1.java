import java.util.*;
public class Exemplu1{
    public static void main(String [] args){
        
        List<Angajat> list = Arrays.asList(
            new Angajat("Ion","Barlad",-456.84),
            new Angajat("Marius","Bucuresti",7000),
            new Angajat("Adi","Valcea",45000),
            new Angajat("Viorica","Petrosani",600),
            new Angajat("Matei","Alexandria",1200)
        
        );
        boolean b1 = list.stream()
                         .allMatch(ang->ang.adresa.equals("Bucuresti"));
        boolean b2 = list.stream()
                         .anyMatch(ang->ang.salariu>5000);
        boolean b3 = list.stream()
                         .noneMatch(ang->ang.salariu<0);
        System.out.println("Toti angajatii sunt din Bucuresti: "+b1);
        System.out.println("Cel putin un angajat are salariu >5000: "+b2);
        System.out.println("Niciun angajat nu are salariu <0: "+b3);
    }
}