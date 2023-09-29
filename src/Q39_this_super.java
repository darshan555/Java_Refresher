class Ekclass{
    int a;
    Ekclass(int a){
        this.a = a;
        System.out.println("A = "+a);
    }
    void printme(){
        System.out.println("Value of a is "+a);
    }
}
class Doclass extends Ekclass{
    Doclass(int z){
        super(z);
        System.out.println("I am constructor of Doclass.");
    }
}
public class Q39_this_super {
    public static void main(String[] args) {
        Doclass check = new Doclass(25);
//        check.printme();
    }
}
