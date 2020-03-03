package classWorks.collectionsLesson1;

import homeWorks.nasledovanie2HW.Entity;

import java.io.*;
import java.util.*;

public class Runner {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("kuprienko", "vadim", "SEP-172"));
        students.add(new Student("duysenaliev", "alibi", "1908"));
        students.add(new Student("lebedev", "vladislav", "SEP-172"));

        students.sort(new StudentComparator());

        for(Student s : students){
            System.out.println(s);
        }
    }
}
