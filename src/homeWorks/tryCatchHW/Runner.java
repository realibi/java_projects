package homeWorks.tryCatchHW;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        String str1 = scanner.nextLine();
        int num1 = Integer.parseInt(str1);

        System.out.print("Enter operator: ");
        String operator = scanner.nextLine();

        System.out.print("Enter second number: ");
        String str2 = scanner.nextLine();
        int num2 = Integer.parseInt(str2);

        System.out.print("Result: ");
        try{
            switch(operator){
                case "*":
                    System.out.println(num1 * num2);
                    break;
                case "/":
                    System.out.println(num1 / num2);
                    break;
                case "+":
                    System.out.println(num1 + num2);
                    break;
                case "-":
                    System.out.println(num1 - num2);
                    break;
            }
        }
        catch (Exception exception){
            System.out.println("Exception: " + exception.getMessage());
        }
    }
}