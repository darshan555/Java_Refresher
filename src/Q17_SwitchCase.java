import java.util.Scanner;
public class Q17_SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age:");
        int age = sc.nextInt();

        /*switch (age){
            case 17: {
                System.out.println("You are adult now");
                break;
            }
            case 40:{
                System.out.println("You are semi-experienced");
                break;
            }
            case 50:{
                System.out.println("You are experienced");
                break;
            }
            case 60:{
                System.out.println("You are getting to retirement");
                break;
            }
            default:{
                System.out.println("No..........");
            }
        }*/
        switch (age){
            case 17->
                System.out.println("You are adult now");
            case 25->
                    System.out.println("You are semi-experienced");
            case 50->
                    System.out.println("You are experienced");
            case 60->
                    System.out.println("You are getting to retirement");
            default->
                    System.out.println("No..........");
            }
        }
    }

