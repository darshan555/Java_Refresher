class Base1{
    Base1(){
        System.out.println("I am constructor of Base1 class.");
    }
    Base1(int x){
        System.out.println("I am with value constructor of Base1 class value "+x);
    }
}
class Derived1 extends Base1{
    Derived1(){
        System.out.println("I am constructor of Derived1 class.");
    }
    Derived1(int x,int y){
        super(x);
        System.out.println("I am with value constructor of Derived1 class value "+y);
    }
}
class ChildDerived extends Derived1{
    ChildDerived(){
        System.out.println("I am constructor of ChildDerived class.");
    }
    ChildDerived(int x,int y,int z){
        super(x,y);
        System.out.println("I am with value constructor of ChildDerived class value "+z);
    }
}
public class Q38_Constructor_in_inheriitance {
    public static void main(String[] args) {
//        Derived1 b = new Derived1(5);
        ChildDerived b = new ChildDerived(11,12,13);
    }
}
