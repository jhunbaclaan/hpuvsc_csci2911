package week5;
// code from class
import java.util.*;
public class classwork_2_9_2023 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        //double result = addUp(44.5, 36.4);
        //double tenPercent = tenPercentAdd(result);
        //System.out.println("Original number: " + result + ", and after adding 10%: " + tenPercent);

        //String name = askName(sc);
        //System.out.println("Hi, " + name);

        String fullName = askFirstLastNames(sc);
        System.out.println("Hello, " + fullName);
    }

    public static double addUp(double num1, double num2)
    {
        double total = num1+num2;
        return total;
    }

    public static double tenPercentAdd(double num)
    {
        double total = num*1.1;
        return total;
    }

    public static String askName(Scanner sc)
    {
        System.out.print("What is your name? ");
        String name = sc.nextLine();
        return name;
    }

    public static String askFirstLastNames(Scanner sc)
    {
        System.out.print("What is your first name? ");
        String firstName = sc.nextLine();
        System.out.print("What is your last name? ");
        String lastName = sc.nextLine();
        String fullName = (firstName + " " +lastName);
        return fullName;
    }
}
