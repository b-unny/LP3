public class Robo3D extends Robo{
    
    private double posZ;

    Robo3D(double posX, double posY, double posZ, double vMedia){
        super(posX, posY, vMedia);
        this.posY = posY;
    }

    public void setZ(double Z){
        this.posZ = Z;
    }

    public double getZ(){
        return posZ;
    }
}