import java.util.Scanner;
import java.util.Random;
class Game{
    int number;
    int takeInput;
    int numberOfGuess = 0;
    public Game(){
        Random r = new Random();
        number = r.nextInt(1,50);
    }
    public void getTakeInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a nuber:");
        takeInput = sc.nextInt();
    }
    boolean check(){
        numberOfGuess+= 1;
        if(takeInput==number){
            System.out.println("You are won this game you try total "+numberOfGuess+" in this game");
            return true;
        } else if (takeInput>number) {
            System.out.println("Please guess lower number");
        } else if (takeInput<number) {
            System.out.println("Please guess higher number");
        }
            return false;
    }
}
public class Q35_GameOfGuessNumber {
    public static void main(String[] args) {
        Game g = new Game();
        boolean b = false;
        while (!b){
            g.getTakeInput();
            b = g.check();
            System.out.println(b);
        }

    }
}
