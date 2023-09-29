import java.util.Scanner;
public class Q13_stringMethods {
    public static void main(String[] args) {
        String name = "Darshan"; //index start with 012345...
//        System.out.println(name);
        int value = name.length(); //return length of the string
        System.out.println(value);

        String lstring = name.toLowerCase(); //return lowercase string
        System.out.println(lstring);

        String ustring = name.toUpperCase(); //return Uppercase string
        System.out.println(ustring);

        String surname = "    Beladiya        ";
        String trimString = surname.trim();   //return Trim string
        System.out.println(trimString);

        String subString = name.substring(3);  //return substring
        System.out.println(subString);

        String sub2String = name.substring(3,5);  //return substring
        System.out.println(sub2String);

        String nameReplace = name.replace("n","k");
        System.out.println(nameReplace);
        System.out.println(name);

        System.out.println(name.startsWith("Da"));
        System.out.println(name.endsWith("n"));

        System.out.println(name.charAt(5));
        System.out.println(name.indexOf("sh"));

        System.out.println(name.indexOf("a",3)); //if it can not find it then return -1
        System.out.println(name.lastIndexOf("a"));
        System.out.println(name.lastIndexOf("a",4));

        System.out.println(name.equals("darshan"));
        System.out.println(name.equalsIgnoreCase("darShan"));

        System.out.println("My name is darshan,\n \tI am from \'Surat\'");




    }
}
