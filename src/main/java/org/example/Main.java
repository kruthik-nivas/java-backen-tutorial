package org.example;

import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the first value: ");
            int number1 = scanner.nextInt();

            System.out.print("Enter the second value: ");
            int number2 = scanner.nextInt();

            System.out.println("Press 1 for addition");
            System.out.println("Press 2 for subtraction");
            System.out.println("Press 3 for multiplication");
            System.out.println("Press 4 for Division");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            int result=0;
            boolean defaultSelected = false;

            switch (choice) {
                case 1 -> result = addTwoNumbers(number1, number2);
                case 2 -> result = subtractTwoNumbers(number1, number2);
                case 3 -> result = multiplyTwoNumbers(number1, number2);
                case 4 -> result = divideTwoNumbers(number1, number2);
                default -> {
                    System.out.println("Kindly Enter a valid option. Restarting the application");
                    defaultSelected = true;
                }
            }

            if(defaultSelected) {
                continue;
            }else {
                System.out.println("The answer is: " + result);
            }

            System.out.println("Do you want to continue : ");
            System.out.print("Enter [y/n]: ");

            String option = scanner.next();

            if(option.equals("n") || option.equals("N")){
                break;
            }else if(option.equals("y") || option.equals("Y")){
                continue;
            }else{
                System.out.println("You have entered an invalid option, so quitting the application");
                break;
            }
        }

    }

    private static int addTwoNumbers(int number1,int number2){
        return number1 + number2;
    }
    private static int subtractTwoNumbers(int number1,int number2){
        return number1 - number2;
    }
    private static int multiplyTwoNumbers(int number1,int number2){
        return number1 * number2;
    }
    private static int divideTwoNumbers(int number1,int number2){
        return number1 / number2;
    }
}