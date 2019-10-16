import java.io.*;
public class Exemplu4{
    public static void main(String [] args){
        File file = new File("A/x.txt");
        //cale catre un fisier ce va fi pus in folderul A pe care l-am creat anterior
        try{
            file.createNewFile();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}