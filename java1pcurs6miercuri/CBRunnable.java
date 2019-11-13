import java.util.concurrent.*;
public class CBRunnable implements Runnable{
    CyclicBarrier barrier = new CyclicBarrier(4);
    @Override
    public void run(){
        System.out.println("start");
        try{
            barrier.await();
            System.out.println("end");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
}