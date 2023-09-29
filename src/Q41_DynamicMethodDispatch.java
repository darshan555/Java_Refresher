class Phone{
    public void Showtime(){
        System.out.println("Now timing is...");
    }
    public void on(){
        System.out.println("Phone Starting...");
    }
}
class Smartphone extends Phone{
    public void music(){
        System.out.println("It's music time");
    }
    public void on(){
        System.out.println("Smartphone Starting...");
    }
}
public class Q41_DynamicMethodDispatch {
    public static void main(String[] args) {
        Phone mob1 = new Smartphone();
        mob1.on();
        mob1.Showtime();

    }
}
