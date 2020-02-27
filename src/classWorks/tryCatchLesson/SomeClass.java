package classWorks.tryCatchLesson;

public class SomeClass {
    public void hello(){
        try{
            throw new ArithmeticException("Деление на нуль");
        }
        catch(ArithmeticException ex){
            System.out.println(ex.getMessage());
        }
    }
}
