class car{
    {
        speed=200;
    }
    int speed = 100;
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    {
        speed=200;
    }
}
public class instanceinitializerblock {
    public static void main(String []args){
    car volvo = new car();
    System.out.println(volvo.getSpeed());
    }
}
