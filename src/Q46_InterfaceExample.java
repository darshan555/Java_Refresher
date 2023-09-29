class MyCellphone{
    void gettingNumber(long number){
        System.out.println("Calling "+number);
    }
    void pickCall(){
        System.out.println("Connecting");
    }
}
interface Camara{
    void snapShot();
    void recordVideo();
    default void record4kVideo(){
        System.out.println("record in 4k...");
    }
}
interface Wifi{
    String[] getAllnetwork();
    void connectNetwork(String network);
}
class MySmartMobile extends MyCellphone implements Camara,Wifi{

    @Override
    public void snapShot() {
        System.out.println("Photo pad liya...");
    }

    @Override
    public void recordVideo() {
        System.out.println("Video record kar liya...");
    }

    @Override
    public String[] getAllnetwork() {
        System.out.println("All network list");
        String[] networkList = {"dmb555","turbo++","Telework"};
        return networkList;
    }

    @Override
    public void connectNetwork(String network) {
        System.out.println("Connect with "+network);
    }
}
public class Q46_InterfaceExample {
    public static void main(String[] args) {
        MySmartMobile m1 = new MySmartMobile();
        m1.snapShot();
        m1.recordVideo();
        m1.gettingNumber(7578898758l);
        m1.pickCall();
        String[] ar = m1.getAllnetwork();

        for (String list:
             ar) {
            System.out.println(list);
        }
        m1.connectNetwork("turbo++");

    }
}
