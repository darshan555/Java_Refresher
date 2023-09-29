import java.util.Scanner;
public class Q05_Problem_percentage {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter your marks of subject 1:");
        int mark1 = s.nextInt();
        System.out.println("Enter your marks of subject 1:");
        int mark2 = s.nextInt();
        System.out.println("Enter your marks of subject 1:");
        int mark3 = s.nextInt();
        System.out.println("Enter your marks of subject 1:");
        int mark4 = s.nextInt();
        System.out.println("Enter your marks of subject 1:");
        int mark5 = s.nextInt();
        int total = mark1+mark2+mark3+mark4+mark5;

        float average = total/5f;

        System.out.println("Your marks total is "+total+"and your percentage is "+average);

    }
}
