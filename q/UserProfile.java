import java.util.*;
public class UserProfile{
    List<Listener> listeners = new ArrayList<>();
    public void addPhoto(){
        System.out.println("Poza adaugata pe profil..");
        notifyListeners();
    }
    public void addListener(Listener l){
        listeners.add(l);
    }
    public void removeListener(Listener l){
        listeners.remove(l);
    }
    private void notifyListeners(){
        for(Listener l:listeners){
            l.sendMessage();
        }
    }
    
}