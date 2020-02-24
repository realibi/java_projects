package classWorks.interfaces;

public interface IAbiturient<T> {
    public void passExam(T t);
    public void graduate();
    public void payMoney(int sum);

    default void info(){
        System.out.println("STUDENT OF KAZATU");
    }
}
