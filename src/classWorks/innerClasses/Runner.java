package classWorks.innerClasses;

import java.util.Date;

public class Runner {
    public static void main(String[] args) {
        Book book = new Book();

        Date date = new Date();

        book.addSession(date, "SEP-172");
        book.addSession(date, "SDP-181");

        book.addZachet(date, "SMP-170");

        book.addExam(date, "SMP-170");
        book.addExam(date, "SEP-190");
        book.addExam(date, "SDD-162");

        System.out.println("Total sessions count: " + book.getSessionsCount());
        System.out.println("Total zachets count: " + book.getZachetsCount());
        System.out.println("Total exams count: " + book.getExamsCount());
    }
}
