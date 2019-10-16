import java.io.*;
public class Exemplu2{
    public static void main(String [] args){
        try(
            FileInputStream fis = new FileInputStream("c");
            ObjectInputStream in = new ObjectInputStream(fis);
        ){
            C c = (C)in.readObject();
        }catch(IOException|ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}