abstract class Mobile{
    abstract public void turnOn();
    abstract public void turnOff();
}
class Realme extends Mobile{
    public void turnOn(){
        System.out.println("Turn On realme mobile...");
    }
    public void turnOff(){
        System.out.println("Turn Off realme mobile...");
    }
}
class Readme extends Mobile{
    public void turnOn(){
        System.out.println("Turn On Readme mobile...");
    }
    public void turnOff(){
        System.out.println("Turn Off Readme mobile...");
    }
}
public class Q44_Abstract_Class {
    public static void main(String[] args) {
        Mobile m1 = new Readme();
        Mobile m2 = new Realme();
        m1.turnOn();
        m1.turnOff();
        m2.turnOn();
        m2.turnOff();
    }
}
