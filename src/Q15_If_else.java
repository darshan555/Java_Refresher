import java.util.Scanner;
public class Q15_If_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your age:");
        int age = sc.nextInt();

        if(age>=18){
            System.out.println("Yes boy you can drive");
        }else {
            System.out.println("you can't drive");
        }
    }
}
