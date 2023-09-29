class A{
    int a;
    A(int a){
        this.a = a;
    }
    public void printme(){
        System.out.println("Hello ji keise ho class A method");
    }
}
class B extends A{
    B(){
        super(0);
        System.out.println("Hello ji i am class B Constructor");
    }

    @Override
    public void printme(){
        System.out.println("Hello ji keise ho class B method");
    }
}
public class Q40_overriding {
    public static void main(String[] args) {
        A a1 = new A(4);
        a1.printme();
    }
}
