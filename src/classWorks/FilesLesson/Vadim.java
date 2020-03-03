package classWorks.FilesLesson;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Vadim {
    public static void main(String[] args) {
        Scanner scanner = null;
        try{
            FileReader fr = new FileReader("hello.txt");
            scanner = new Scanner(fr);
            while (scanner.hasNext()){
                if(scanner.hasNextInt()){
                    System.out.println("Int: "+scanner.nextInt());
                }
                else if(scanner.hasNextBoolean()){
                    System.out.println("Boolean: "+scanner.nextBoolean());
                }
                else if(scanner.hasNextDouble()){
                    System.out.println("Double: "+scanner.nextDouble());
                }
                else{
                    System.out.println("String: "+scanner.next());
                }
            }
        }
        catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        finally {
            if(scanner!=null){
                scanner.close();
            }
        }
    }
}
