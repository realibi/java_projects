package classWorks.collectionsLesson1;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student first, Student second) {
        return first.getSurname().compareTo(second.getSurname());
    }
}
