package classWorks.formattinLesson;

import java.text.ParseException;
import java.util.Date;
import java.util.Formatter;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        Date currentDate = new Date();
        Formatter formatter = new Formatter();

        String str1 = scanner.nextLine();
        int num1 = Integer.parseInt(str1);

        System.out.println();
        System.out.println(formatter.format("Hex: %x, Octal: %o%nСегодня %td число месяца, месяц %tB, день недели %tA", num1, num1, currentDate, currentDate, currentDate));

    }
}
