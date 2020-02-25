package classWorks.interfacesLesson;

import java.util.Date;

public class Exam {
    private String subject;
    private Date date;

    public Exam(String subject, Date date) {
        this.subject = subject;
        this.date = date;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
