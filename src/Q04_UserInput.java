import java.util.Scanner;
public class Q04_UserInput {
    public static void main(String[] args) {
        System.out.println("Taking Input From the user");
        Scanner s = new Scanner(System.in); //System.in means it take input from the keyboard

/*
        System.out.print("Enter the number of a:");
        int a = s.nextInt();
        System.out.print("Enter the number of b:");
        int b = s.nextInt();
        int sum = a + b;
        System.out.println("The sum of a and b is "+sum);
*/
        /*System.out.println("Enter value:");
        Boolean n = s.hasNextInt(); // It return false if we enter other value not int or of we enter int than return true
        System.out.println(n);*/

        System.out.println("Enter any line:");
        String name = s.nextLine();
        System.out.println(name);

    }

}
