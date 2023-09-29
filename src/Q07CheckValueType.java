import java.util.Scanner;
public class Q07CheckValueType {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Value:");

        Boolean value = s.hasNextInt();
        if(value){
            System.out.println("Value is integer.");
        }else {
            System.out.println("Value is not integer");
        }
    }
}
