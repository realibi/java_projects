package classWorks.collectionsLesson1;

import homeWorks.nasledovanie2HW.Entity;

import java.util.Comparator;

public class Student {
    private static int id = 0;
    private String surname;
    private String name;
    private String groupName;

    public Student(String surname, String name, String groupName) {
        id++;
        this.surname = surname;
        this.name = name;
        this.groupName = groupName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", groupName='" + groupName + '\'' +
                '}';
    }

    public static int getId() {
        return id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
}
