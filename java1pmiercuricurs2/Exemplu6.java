import java.io.*;
public class Exemplu6{
    public static void main(String [] args){
        try(InputStreamReader reader = new InputStreamReader(System.in);
            BufferedReader in = new BufferedReader(reader);
        ){
            String line = "";
            while(true){
                line = in.readLine();
                String [] v = line.split("\\s+");
                File f = null;
                switch(v[0]){
                    case "createFile": f = new File(v[1]);
                                       f.createNewFile();
                                       break;
                    case "createDirectory": f = new File(v[1]);
                                       f.mkdir();
                                       break;  
                    case "delete": f = new File(v[1]);
                                       f.delete();
                                       break;  
                    case "list": f = new File(v[1]);
                                 String [] fileNames = f.list();
                                 for(String fileName:fileNames){
                                        System.out.println(fileName);
                                    }
                                    //f.listFiles();
                                    break;
                    case "exit": System.exit(0);
                    default: System.out.println("Comanda invalida");
                }
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}