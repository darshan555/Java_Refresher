import java.util.Scanner;
public class Q22_Practice_Set {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        // Question 1 : Pattern
       /* for (int i = 5;i>=1;i--){
            for (int j = 0;j<i;j++){
                System.out.print("*");
            }
            System.out.print("\n");

        }*/

        // Question 2: sum of first n even number

        /*System.out.println("Enter the value that you want to sum of number:");
        int n = sc.nextInt();
        int sum = 0;

        for(int i = 1; i<=n ; i++){
            if(i%2 == 0){
                sum = sum+i;
                System.out.println(i);
            }
        }
        System.out.println("Sum :"+sum);*/

        // Question 3: Multiplication table

        /*System.out.println("Enter the value that you want to need any table:");
        int n = sc.nextInt();
        for(int i = 1; i<= 10;i++){
            System.out.println(n + "*" + i + "=" +(i*n));
        }*/

        // Question 4: Factorial of given number

        /*System.out.println("Enter the value that you want to need:");
        int n = sc.nextInt();
        long fact = 1;
        for(int i = 1;i<=n;i++){
            fact *= i;
        }
        System.out.println("Factorial of "+ n +" is "+fact);*/

        // Question 5: repeat 5 using while loop
        /*int n = 1;
        while (n<=5){
            System.out.println("5");
            n++;
        }*/

        // Question :6

        int number = 8;
        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            int product = number * i;
            sum += product;
        }

        System.out.println("The sum of the 8 multiplication table is: " + sum);
    }
}
