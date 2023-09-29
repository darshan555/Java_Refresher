import java.util.Scanner;
public class Q11_graterOrNot {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter any value:");
        int number = s.nextInt();

        if(number>8){
            System.out.println("Your value is greater than 8");
        }else if(number<8){
            System.out.println("Your value is less than 8");
        }else {
            System.out.println("Your value is equal to 8");
        }
    }
}
