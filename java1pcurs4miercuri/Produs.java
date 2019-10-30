public class Produs{
    String nume;
    String categorie;
    double pret;
    int stoc;
    public Produs(String nume,String categorie, double pret, int stoc){
        this.nume = nume;
        this.categorie = categorie;
        this.pret = pret;
        this.stoc = stoc;
    }
    public String toString(){
        return nume+" "+categorie+" "+pret+" "+stoc;
    }
}