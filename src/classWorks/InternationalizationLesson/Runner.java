package classWorks.InternationalizationLesson;

import org.w3c.dom.ls.LSOutput;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. russian");
        System.out.println("2. english");

        System.out.print("language: ");
        int languageInput = 1;//scanner.nextInt();

        String language = "";

        switch(languageInput) {
            case 1:
                language = "RU";
                break;
            case 2:
                language = "ENG";
        }

        Locale current = new Locale(language);
        ResourceBundle rb = ResourceBundle.getBundle("text", current);

        System.out.print("Ваше сообщение: ");
        String message = scanner.nextLine();
        System.out.println(message);

        System.out.println(rb.getString(message));
    }
}
