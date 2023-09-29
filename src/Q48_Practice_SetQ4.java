interface TvRemote{
    void on();
    void off();
}
interface SmartTvRemote extends TvRemote{
    void BluetoothOn();
    void BluetoothOff();
}
class Remote implements SmartTvRemote{

    @Override
    public void on() {
        System.out.println("Tv on");
    }

    @Override
    public void off() {
        System.out.println("Tv off");
    }

    @Override
    public void BluetoothOn() {
        System.out.println("Bluetooth on");
    }

    @Override
    public void BluetoothOff() {
        System.out.println("Bluetooth off");
    }
}
public class Q48_Practice_SetQ4 {
    public static void main(String[] args) {
        SmartTvRemote tv1 = new Remote();
        tv1.off();
    }
}
