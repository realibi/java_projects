package homeWorks.internationalizationHW;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Русский");
        System.out.println("2. English");
        System.out.print("Language/Язык: ");

        String userInput = scanner.nextLine();
        int userChoice = Integer.parseInt(userInput);

        String language = "";

        try{
            switch(userChoice){
                case 1:
                    language = "RU";
                    break;
                case 2:
                    language = "EN";
                    break;
                default:
                    throw new Exception("Incorrect input!");
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            System.exit(0);
        }

        Locale current = new Locale(language);
        ResourceBundle rb = ResourceBundle.getBundle("text", current);

        System.out.println();
        System.out.println(rb.getString("title"));
        System.out.println(rb.getString("cpu"));
        System.out.println(rb.getString("memory"));
        System.out.println(rb.getString("storage"));
    }
}
