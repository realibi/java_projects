package classWorks.FilesLesson;

import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.util.Date;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            File file = new File("hello.txt");
            //создаем объект FileReader для объекта File
            FileReader fr = new FileReader(file);
            //создаем BufferedReader с существующего FileReader для построчного считывания
            BufferedReader reader = new BufferedReader(fr);
            // считаем сначала первую строку
            String line = reader.readLine();

            String dataFromFile = "";

            System.out.println("Исходные данные: ");
            while (line != null) {
                System.out.println(line);
                dataFromFile += line + "\n";
                line = reader.readLine();
            }

            System.out.print("\nВведите подстроку: ");
            String subString = scanner.nextLine();

            if(dataFromFile.contains(subString)){
                dataFromFile = dataFromFile.replaceAll(subString, "");
            }
            else{
                System.out.println("Такой подстроки нет!");
            }

            System.out.println("\nДанные после обработки: ");
            System.out.println(dataFromFile);


            try(FileOutputStream fos=new FileOutputStream("hello.txt"))
            {
                // перевод строки в байты
                byte[] buffer = dataFromFile.getBytes();

                fos.write(buffer, 0, buffer.length);
            }
            catch(IOException ex){

                System.out.println(ex.getMessage());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
