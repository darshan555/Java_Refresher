import java.util.Scanner;
class Cylinder{
    private int height;
    private int radius;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public double volume(){
        double pi = Math.PI;
        double vol = pi*(radius*radius)*height;
        return vol;
    }
    public double area(){
        double pi = Math.PI;
        double ar = (2*(pi*radius*height))+(2*pi*(radius*radius));
        return ar;
    }

}
public class Q36_Practice_Set {
    public static void main(String[] args) {
        Cylinder c1  = new Cylinder();
        c1.setHeight(12);
        c1.setRadius(9);
//        System.out.println(c1.getHeight());
//        System.out.println(c1.getRadius());
        System.out.println(c1.area());
        System.out.println(c1.volume());
    }
}
