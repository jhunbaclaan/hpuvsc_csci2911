package week5;
/*
 * more stuff copied from class
 */
import java.util.*;

public class classwork_2_7_2023 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        testAverage(90.35, 34, 76.4);
        saySomethingFunny();
        showMenu();
        String studentName = "Susie";
        greeting(studentName);
        greeting("Bob");
        greetingNameAge("Tom", 8);
        doubleUp(44, 25);

        System.out.print("how many hours have you worked this week? ");
        double hours = sc.nextDouble();
        System.out.print("what is your hourly rate? ");
        double rate = sc.nextDouble();
        grossPay(hours, rate);

    }

    public static void saySomethingFunny()
    {
        System.out.println("chungles");
    }

    public static void showMenu()
    {
        greeting("Bob");
        System.out.println("Menu");
        System.out.println("1. Greeting");
        System.out.println("2. Exit");
    }

    public static void greeting(String name)
    {
        System.out.println("Greetings, " + name + "!");
    }

    public static void greetingNameAge(String name, int age) 
    {
        System.out.println("Hello " + name + "! You are " + age + " years old.");   
    }

    public static void doubleUp(int num1, int num2)
    {
        int total = num1 + num2;
        System.out.println(num1 + "+" + num2 + "=" + total);
    }

    public static void grossPay(double hoursWorked, double hourlyRate)
    {
        double pay = hoursWorked * hourlyRate;
        System.out.println("You have worked " + hoursWorked + " hours, at a rate of $" + hourlyRate + " per hour.");
        System.out.println("Your gross pay is $" + pay);
    }

    public static void testAverage(double score1, double score2, double score3)
    {
        double average = (score1+score2+score3)/3;
        System.out.println("Average test score: " + average);
    }
}
