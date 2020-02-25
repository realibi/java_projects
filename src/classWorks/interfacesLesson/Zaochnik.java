package classWorks.interfacesLesson;

public class Zaochnik extends Student implements IAbiturient<Exam> {

    public Zaochnik(String firstName, String secondName, String thirdName, int birthYear, int courseNum, int groupNum) {
        super(firstName, secondName, thirdName, birthYear, courseNum, groupNum);
    }

    @Override
    public void passExam(Exam exam) {
        System.out.println("Passed exam: " + exam.getSubject() + ". Date: " + exam.getDate());
    }

    @Override
    public void graduate() {
        System.out.println(this.getSecondName() + " " + this.getThirdName() + " graduated!");
    }

    @Override
    public void payMoney(int sum) {
        System.out.println("Payment successfully done: " + sum);
    }

    @Override
    public void info() {
        System.out.println("Information about " + this.getSecondName() + ":");
        System.out.println("Group: " + this.getGroupNum());
        System.out.println("Course: " + this.getCourseNum());
    }
}
