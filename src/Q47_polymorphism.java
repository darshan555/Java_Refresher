class MyCellphone1{
    void gettingNumber(long number){
        System.out.println("Calling "+number);
    }
    void pickCall(){
        System.out.println("Connecting");
    }
}
interface Camara1{
    void snapShot();
    void recordVideo();
    default void record4kVideo(){
        System.out.println("record in 4k...");
    }
}
interface Wifi1{
    String[] getAllnetwork();
    void connectNetwork(String network);
}
class MySmartMobile1 extends MyCellphone implements Camara,Wifi{

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
public class Q47_polymorphism {
    public static void main(String[] args) {
        Camara cam1 = new MySmartMobile1();     //Camara is reference and MySmartMobile1 is object
        cam1.recordVideo();
    }
}
