public class Exemplu3{
    public static void main(String [] args){
        Robot r1 = new Robot.Builder().setMaterial("aluminiu").build();
        Robot r2 = new Robot.Builder()
                            .setMaterial("titan")
                            .setGreutate(1500)
                            .setDefect(true)
                            .setAnFabricatie(2005)
                            .build();
    }
}