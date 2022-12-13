public class PCV {
    double topSpeed;
    double vehicleAcceleration;
    double length;
    double width;
    public PCV(int Tank){
        if (Tank == 0){
            //LVKV 9040
            //Basic Movment
            //in km/h
            topSpeed = 70;
            //in m/s - not sure if this is a realist acceleration
            vehicleAcceleration = 10;
            //in m
            length = 7;
            //in m
            width = 3.5;

        }
    }
    public double getTopSpeed(){
        return topSpeed;
    }
    public double getvehicleAcceleration(){
        return vehicleAcceleration;
    }
    public double getLength(){
        return length;
    }
    public double getWidth(){
        return width;
    }
}
