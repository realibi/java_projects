package classWorks.innerClasses;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Book {
    private static Info info = new Info();

    public Info getInfo() {
        return info;
    }

    public int getSessionsCount(){
        int totalSessions = 0;
        for(Info.Session session : this.getInfo().sessions){
            totalSessions++;
        }

        return totalSessions;
    }

    public int getZachetsCount(){
        int totalZachets = 0;
        for(Info.Zachet zachet : this.getInfo().zachets){
            totalZachets++;
        }

        return totalZachets;
    }

    public int getExamsCount(){
        int totalExam = 0;
        for(Info.Exam exam : this.getInfo().exams){
            totalExam++;
        }

        return totalExam;
    }

    public void addSession(Date date, String groupName){
        Info.Session session = new Info.Session(date, groupName);
        this.getInfo().sessions.add(session);
    }

    public void addZachet(Date date, String groupName){
        Info.Zachet zachet = new Info.Zachet(date, groupName);
        this.getInfo().zachets.add(zachet);
    }

    public void addExam(Date date, String groupName){
        Info.Exam exam = new Info.Exam(date, groupName);
        this.getInfo().exams.add(exam);
    }

    private static class Info{
        private List<Session> sessions = new ArrayList<>();
        private List<Zachet> zachets = new ArrayList<>();
        private List<Exam> exams = new ArrayList<>();


        public List<Zachet> getZachets() {
            return zachets;
        }

        public List<Exam> getExams() {
            return exams;
        }

        static class Session extends Book.Info.Entity{
            public Session(Date date, String groupName) {
                this.date = date;
                this.groupName = groupName;
            }
        }

        static class Zachet extends Book.Info.Entity{
            public Zachet(Date date, String groupName) {
                this.date = date;
                this.groupName = groupName;
            }
        }

        static class Exam extends Book.Info.Entity{
            public Exam(Date date, String groupName) {
                this.date = date;
                this.groupName = groupName;
            }
        }

        static abstract class Entity {
            Date date;
            String groupName;
        }
    }
}
