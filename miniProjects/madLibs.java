package miniProjects;
import java.util.Scanner;
public class madLibs {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String adjective1;
    String noun1;
    String adjective2;
    String verb1;
    String adjective3;

        // collect user input
        System.out.println("Enter adjective 1: " );
        adjective1 = scanner.next();
        System.out.println("Enter adjective 2: ");
        adjective2 = scanner.next();
        System.out.println("Enter adjective 3: ");
        adjective3 = scanner.next();
        System.out.println("Enter verb 1: ");
        verb1 = scanner.next();
        System.out.println("Enter noun 1: ");
        noun1 = scanner.next();

        // print story
        System.out.println("Today I went to a " + adjective1 + " zoo.");
        System.out.println("In an exhibit, I saw a "+noun1+".");
        System.out.println(noun1 + " was "+ adjective2 +" and "+ verb1+ "!");
        System.out.println("I was " + adjective3 + "!");
        scanner.close();
    }
}
