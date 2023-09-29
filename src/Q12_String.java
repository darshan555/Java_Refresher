import java.util.Scanner;
public class Q12_String {
    public static void main(String[] args) {
        /*String name = new String("Darshan");
        System.out.println(name);*/

        /*String name = "Darshan";
        System.out.println(name);*/

        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter Your name:");
        String name = sc.nextLine();

        System.out.format("Your name is %s",name);
    }
}
