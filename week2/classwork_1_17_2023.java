/*
 * a program that intends to test different data types
 * created by: jhun baclaan
 * d.o.c: jan 17, 2023
 */
import java.util.*;
public class classwork_1_17_2023 {
    public static void main(String[] args)
    {
        /*
         * following instructions in class
         * program structure (mostly) emulates what was typed in class
         */
        String name = "jhun baclaan";
        int age = 17;
        byte numOfClasses = 6;
        double lunchCost = 10.57324734;
        boolean graduate = false;
        char letterGrade = 'A';
        final double TAXRATE = 0.045; // note: final variables are ALL UPPERCASE

        Scanner sc = new Scanner(System.in);
        System.out.print("who is your favorite friend?");
        String friend = sc.nextLine();

        System.out.println("favorite friend: " + friend);
        System.out.print("favorite friend: " + friend);

        System.out.printf(" %s cost of lunch is $%.2f", name, lunchCost + "\n");

        if (age == 21)
        {
            System.out.println("you are 21");
            System.out.println("go buy a drink");
        }
        else
        {
            System.out.println("you are too young");
        }
    }
}
