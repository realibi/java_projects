package classWorks.interfaces;

import java.util.Date;

public class Runner {
    public static void main(String[] args) {
        Zaochnik alibi = new Zaochnik("Duysenaliev", "Alibi", "Erlanovich", 2001, 1, 1908);

        Exam exam = new Exam("Math", new Date());

        System.out.println();
        alibi.passExam(exam);

        System.out.println();
        alibi.payMoney(450000);

        System.out.println();
        alibi.graduate();

        System.out.println();
        alibi.info();
    }
}
