// Name: Shaniela Carr
// Date: 05-31-2025
// Purpose: Prompt the user for their name and a favorite quote, then display a formatted message.
package miniProjects; // package should come before any import statements;
import java.util.Scanner;
public class greeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello!!  \nWhat is your name? ");
        String name = scanner.nextLine();
        System.out.println("Thats a great name! \nWhat's your favorite quote?: ");
        String quote = scanner.nextLine();
        String finalGreeting = "Hello "+name+ ", Nice to meet you! \nYour favorite quote is: "+quote;
        System.out.println(finalGreeting);
        scanner.close();
    }
}
