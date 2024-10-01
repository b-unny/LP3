public class Robo{
    private double posX;
    private double posY;
    private double vMedia;

    Robo(){
        posX = 0.0;
        posY = 0.0;
        vmedia = 0.0;
    }
    
    Robo(double posX, double posY, double vMedia){
        this.posX = posX;
        this.posY = posY;
        this.vMedia = vmedia
    }

    public void mover(double X, double Y){
        posX = X;
        posY = X;
    }

    public void mover(double X, double Y, double Z){
        posX = X;
        posY = Y;
        posZ = Z;
    }

    public double getX(){
        return posX;
    }

    public double getY(){
        return posY;
    }

    public void setX(double X){
        posX = X;
    }

    public void setX(double Y){
        posY = Y;
    }

    public double calcTempoTrajetoria(double x, double y, double z){
        return 0;
    }
}
