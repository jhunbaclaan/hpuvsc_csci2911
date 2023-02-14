package week6;
/*
 * very very similar program to lab5, so just look at those files for extra documentation
 * simply put, this file just serves to hold all of the methods and the program class separate from the main runner
 * the "main runner" in particular is 'assignment_2_2_14_2023.java'
 */
import java.util.*;
public class program {
    public program()
    {
        Scanner sc = new Scanner(System.in);
        double budget, expense, leftOver, toBorrow;
        System.out.print("-=-=-=- Kimo's Budget Program -=-=-=-");
        System.out.print("Enter your budget for the month: "); // outside of the main program loop because you only need to do this once
        budget = sc.nextDouble();
        while (isPositive(budget))
        {
            System.out.println("Please enter a positive value for your budget!!");
            System.out.print("Enter your budget for the month: ");
            budget = sc.nextDouble();
        }
        boolean running = true;
        while (running)
        {
            System.out.print("Enter an expense, or a negative number to quit: ");
            if (!isPositive())
        }
    }

    public static boolean isPositive(double input) // input validation method
    {
        if (input <= 0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public static boolean isAlphabetical()
}
