//Builder design pattern
public class Robot{
    String material;
    String alimentare;
    double greutate;
    int anFabricatie;
    int nrBrate;
    boolean defect;
    public static class Builder{
        private Robot robot = new Robot();
        public Builder setMaterial(String material){
            robot.material = material;
            return this;
        }
        public Builder setAlimentare(String alimentare){
            robot.alimentare = alimentare;
            return this;
        }
        public Builder setGreutate(double greutate){
            robot.greutate = greutate;
            return this;
        }
        public Builder setAnFabricatie(int anFabricatie){
            robot.anFabricatie = anFabricatie;
            return this;
        }
        public Builder setNrBrate(int nrBrate){
            robot.nrBrate = nrBrate;
            return this;
        }
        public Builder setDefect(boolean defect){
            robot.defect = defect;
            return this;
        }
        public Robot build(){
            return robot;
        }
        
    }
}