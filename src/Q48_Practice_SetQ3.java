abstract class Telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}
class SmartTelephone extends Telephone{

    @Override
    void ring() {
        System.out.println("Hello jii");
    }

    @Override
    void lift() {
        System.out.println("Mobile lift");
    }

    @Override
    void disconnect() {
        System.out.println("Mobile disconnect");
    }
}
public class Q48_Practice_SetQ3 {
    public static void main(String[] args) {
        SmartTelephone st1 = new SmartTelephone();
        st1.disconnect();
    }
}
