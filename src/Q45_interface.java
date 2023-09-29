interface Bicycle{
    int maxspeed = 100; //it's final value
    void applyBreak(int decrement);
    void applySpeed(int increment);
}
interface HornPlease{
    void horn1();
    void horn2();
}
class Avon implements Bicycle,HornPlease{
    int speed = 80;
    public void applyBreak(int decrement){
        this.speed -= decrement;
        System.out.println("Now your speed is "+speed);
    }
    public void applySpeed(int increment){
        this.speed += increment;
        System.out.println("Now your speed is "+speed);
    }
    public void horn1(){
        System.out.println("Kabhi khushi kabhi gam......");
    }
    public void horn2(){
        System.out.println("pee pee pee");
    }
}
public class Q45_interface {
    public static void main(String[] args) {
        Avon b1 = new Avon();
        b1.applyBreak(20);
        b1.applySpeed(30);
        b1.horn1();


    }
}
