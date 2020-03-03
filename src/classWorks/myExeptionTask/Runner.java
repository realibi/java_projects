package classWorks.myExeptionTask;

import java.lang.invoke.WrongMethodTypeException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pattern p1 = Pattern.compile("[A-Z][a-z]+");

        System.out.print("Enter your name: ");
        try{
            String userName = scanner.nextLine();
            Matcher m1 = p1.matcher(userName);
            if(!m1.matches()){
                throw new WrongNameException(userName);
            }
        }
        catch(WrongNameException exc){
            System.out.println(exc.getMessage());
            System.exit(0);
        }
        finally{
            System.out.println("Good. Let's answer some questions!");
        }

        HashMap<String, String> capitalCities = new HashMap<String, String>();

        capitalCities.put("Nur-Sultan", "Kazakhstan");
        capitalCities.put("Moscow", "Russia");
        capitalCities.put("Vienna", "Austria");
        capitalCities.put("Minsk", "Belarus");

        int points = 0;

        for (String country : capitalCities.keySet()){
            try{

                System.out.print("Enter the capital of " + capitalCities.get(country) + ": ");

                String userAnswer = scanner.nextLine();

                if(userAnswer.equals(country)){
                    points++;
                }
                else{
                    throw new CityNotFoundException(country);
                }
            }
            catch(CityNotFoundException exception){
                System.out.println(exception.getMessage());
            }
        }

        System.out.println("Points: " + points);
    }
}
