import java.io.*;
public class Exemplu1{
    public static void main(String [] args){
        try(FileOutputStream fos = new  FileOutputStream("c");
            ObjectOutputStream out = new ObjectOutputStream(fos);
        ){
            C c = new C();
            out.writeObject(c);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}