import java.util.Scanner;
public class Q14_Practice_Set {
    public static void main(String[] args) {
        //1. Convert lower case
        Scanner sc = new Scanner(System.in);
        /*System.out.print("Enter your name:");
        String name = sc.nextLine();
        System.out.printf("Your name is %s",name.toUpperCase());*/

        //2. Replace with underscore
        /*String fullLine = "My name is darshan";
        System.out.println(fullLine.replace(" ","_"));*/

        //3. Replace <|name|> to your name
        /*String letter = "Dear <|name|>, How are you?";
        letter = letter.replace("<|name|>","Darshan");
        System.out.println(letter);*/

        //4. Check Double space and triple space
        String mystring = "This contain    double space and triple space";

        System.out.println(mystring.indexOf("  "));
        System.out.println(mystring.indexOf("            "));

    }
}
