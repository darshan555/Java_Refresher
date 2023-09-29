class Circle{
    int radius;
    Circle(int r){
        this.radius = r;
        System.out.println("This is Circle constructor.");

    }
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}
class Cylinder1 extends Circle{
    int height;
    Cylinder1(int r,int h){
        super(r);
        System.out.println("This is Cylinder constructor.");
        this.height = h;
    }
    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
}
public class Q43_Practice_Set {
    public static void main(String[] args) {
        Cylinder1 obj1 = new Cylinder1(4,5);
        System.out.println(obj1.volume());
        System.out.println(obj1.area());
    }
}
