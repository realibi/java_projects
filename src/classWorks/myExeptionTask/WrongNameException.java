package classWorks.myExeptionTask;

public class WrongNameException extends Exception {
    private String name;
    private String message = "Невозможное значение для имени";

    public WrongNameException(String name) {
        this.name = name;
    }

    public WrongNameException(String name, String message) {
        this.name = name;
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
