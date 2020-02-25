package classWorks.stringsLesson;

import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Runner {
    public static void main(String[] args) {
        Locale current = Locale.getDefault();

        System.out.println(current.getDisplayCountry());
        System.out.println(current.getDisplayLanguage());
        System.out.println(current.getDisplayName());
    }
}
