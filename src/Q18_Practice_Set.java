import java.util.Scanner;
import java.util.Random;
public class Q18_Practice_Set {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Q1.
        /*int a = 11;       //error
        if(a = 11){

        }*/
        //Q2.

        /*System.out.print("Enter your physics marks:");
        int mark1 = sc.nextInt();
        System.out.print("Enter your Maths marks:");
        int mark2 = sc.nextInt();
        System.out.print("Enter your English marks:");
        int mark3 = sc.nextInt();

        float avg = (mark1+mark2+mark3)/3.0f;
        System.out.println("Your percentage is "+avg);
        if(avg>=40 && mark1>=33 && mark2>=33 && mark3>=33){
            System.out.println("Congratulations bro, you are pass.");
        }else {
            System.out.println("Sorry, you are fail");
        }*/

        //Q3.

        /*System.out.print("Please enter your income:");
        int income = sc.nextInt();
        int tax = 0;
        if(income >= 250000 && income <= 500000 ){
             tax = ((income-250000)*5)/100;
            System.out.println("You need to pay tax "+ tax);
        } else if (income >= 500000 && income <= 1000000) {
            tax = ((500000-250000)*5)/100;
            tax += ((income-500000)*20)/100;
            System.out.println("You need to pay tax "+ tax);
        } else if (income > 1000000) {
            tax = ((500000-250000)*5)/100;
            tax += ((1000000-500000)*20)/100;
            tax += ((income-1000000)*30)/100;
            System.out.println("You need to pay tax "+ tax);
        }else {
            System.out.println("You don't need to pay tax");
        }*/

        //Q4.

        /*System.out.print("Enter 4a number:");
        int number = sc.nextInt();

        switch (number){
            case 1-> System.out.println("Monday");
            case 2-> System.out.println("Tuesday");
            case 3-> System.out.println("Wednesday");
            case 4-> System.out.println("Thursday");
            case 5-> System.out.println("Friday");
            case 6-> System.out.println("Saturday");
            case 7-> System.out.println("Sunday");
        }*/

        //Q5.check Website type
       /* System.out.println("Enter your website url:");
        String website = sc.nextLine();

        if(website.endsWith(".org")){
            System.out.println("This is an organizational website");
        } else if (website.endsWith(".com")) {
            System.out.println("This is a Commercial website");
        } else if (website.endsWith(".in")) {
            System.out.println("This is an Indian website");
        }else {
            System.out.println("This is other website");
        }*/

        //Q6. Rock , scissors , paper

        Random r = new Random();

        int rvalue = r.nextInt(0,3);
        String[] choices = { "rock", "paper", "scissors" };

        String computerChoice = choices[rvalue];

        System.out.println("Enter Your choice from \"rock\", \"paper\", \"scissors\":");
        String yourChoice = sc.nextLine();

        if (yourChoice.equals(computerChoice)){
            System.out.println("You Select "+yourChoice);
            System.out.println("Computer Select "+computerChoice);
            System.out.println("Match Tied");
        } else if  ((yourChoice.equals("rock") && computerChoice.equals("scissors")) ||
                    (yourChoice.equals("paper") && computerChoice.equals("rock")) ||
                    (yourChoice.equals("scissors") && computerChoice.equals("paper"))) {
            System.out.println("You Select "+yourChoice);
            System.out.println("Computer Select "+computerChoice);
            System.out.println("You Win");
        }else {
            System.out.println("Computer Select "+computerChoice);
            System.out.println("Computer wins");
        }
    }
}
