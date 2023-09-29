class Monkey{
    void jump(){
        System.out.println("Monkey is jumping");
    }
    void bite(){
        System.out.println("Monkey is biting");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimal{

    @Override
    public void eat() {
        System.out.println("Darshan is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Darshan is sleeping");
    }
}
public class Q48_Practice_SetQ2 {
    public static void main(String[] args) {
        Human h1 = new Human();
        h1.eat();
    }
}
