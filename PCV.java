public class PCV {
    //movement attributes//
    double topSpeed;
    double vehicleAcceleration;
    double turnSpeed;
    double length;
    double width;
    double rotation;
    //initializer
    public PCV(int Tank){
        if (Tank == 0){
            //LVKV 9040
            //Basic Movment
            //in km/h
            topSpeed = 70;
            //in m/s - not sure if this is a realist acceleration
            vehicleAcceleration = 10;
            //in degrees per turn input?
            turnSpeed = .1;
            //in m
            length = 7;
            //in m
            width = 3.5;
            //in degrees->360.00->36000
            rotation = 0;

        }
    }
    public void turn(boolean direction){
        if(direction){
            rotation = rotation + turnSpeed;
        }
        else {
            rotation = rotation - turnSpeed;
        }
        //then should call redraw or something
        //or like a somethingchanged function
    }
    //getters for movement
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
