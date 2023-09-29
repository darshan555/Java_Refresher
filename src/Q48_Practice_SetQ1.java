abstract class Pen{
    abstract void write();
    abstract void refill();
}
class FountainPen extends Pen{

    @Override
    void write() {
        System.out.println("Write");
    }

    @Override
    void refill() {
        System.out.println("Refill");
    }
    void ChangeNib(){
        System.out.println("Changing the nib");
    }
}
public class Q48_Practice_SetQ1 {
    public static void main(String[] args) {
        FountainPen p1 = new FountainPen();
        p1.ChangeNib();
    }
}
