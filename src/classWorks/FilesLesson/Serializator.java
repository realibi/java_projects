package classWorks.FilesLesson;

import java.io.*;

public class Serializator<T> {
    public boolean serialization(T object, String fileName){
        boolean flag = false;
        File f = new File("hello.txt");
        ObjectOutputStream ostream = null;

        try{
            FileOutputStream fos = new FileOutputStream(f);
            if(fos != null){
                ostream = new ObjectOutputStream(fos);
                ostream.writeObject(object);
                flag = true;
            }
        }
        catch(FileNotFoundException e){
            System.err.println("Файл не может быть создан: " + e);
        }
        catch (NotSerializableException e){
            System.err.println("Класс не может быть создан: " + e);
        }
        catch(IOException e){
            System.err.println(e);
        }
        finally{
            try{
                if(ostream != null){
                    ostream.close();
                }
            }
            catch(IOException e){
                System.err.println("Ошибка закрытия потока");
            }
        }
        return flag;
    }

    public T deserialization(String fileName) throws InvalidObjectException{
        File fr = new File("hello.txt");
        ObjectInputStream istream = null;
        try{
            FileInputStream fis = new FileInputStream(fr);
            istream = new ObjectInputStream(fis);
            T object = (T) istream.readObject();
            return object;
        }
        catch(ClassNotFoundException ce){
            System.err.println("Класс не существует: " + ce);
        }
        catch(FileNotFoundException e){
            System.err.println("Файл для десериализации не существует: " + e);
        }
        catch(InvalidClassException ioe){
            System.err.println("Несовпадение версий классов: " + ioe);
        }
        catch(IOException e){
            System.err.println("Ошибка закрытия потока.");
        }
        finally {
            try{
                if(istream != null){
                    istream.close();
                }
            }
            catch(IOException e){
                System.err.println("Ошибка закрытия потока.");
            }
        }
        throw new InvalidObjectException("Объект не восстановлен.");
    }
}
