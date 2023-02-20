package week6;
/*
 * very very similar program to lab5, so just look at those files for extra documentation
 * simply put, this file just serves to hold all of the methods and the program class separate from the main runner
 * the "main runner" in particular is 'assignment_2_2_14_2023.java'
 * d.o.c: feb 14, 2023
 * created by: jhun baclaan
 */
import java.util.*;
public class Program {
    public Program()
    {
        Scanner sc = new Scanner(System.in);
        double amountAfterAll = 0;
        double total;
        System.out.println("-=-=-=- Kimo's Budget Program -=-=-=-");
        double budget = readDoubleInput(sc, "Enter your budget for the month: "); // outside of the main program loop because you only need to do this once
        boolean running = true;
        while (running)
        {
            double expense = takeExpense(sc, "Enter an expense, or a negative number to quit: ");
            if (isPositive(expense) == true)
            {
                amountAfterAll += expense;
            }
            else
            {
                total = calculateExpenses(amountAfterAll, budget);
                if (amountAfterAll < 0)
                {
                    System.out.println("You are OVER budget by $" +  total + "! Be sure to borrow some money!");
                }
                else
                {
                    System.out.println("You are UNDER budget by $" + total + "! Great!");
                }
                running = false;
            }
        }
    }

    public static boolean isPositive(double input) // input validation method for positive values
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

    public static double readDoubleInput(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                double value = sc.nextDouble();
                if (value < 0) { // prevent negative inputs
                    System.out.print("Invalid entry! Value must be positive. Please enter again: ");
                    continue;
                }
                return value;
            } catch (InputMismatchException e) {
                System.out.print("Invalid entry! Please enter a numeric value: ");
                sc.next(); // consume the invalid input
            }
        }
    }

    public static double takeExpense(Scanner sc, String prompt) { // modified readDoubleInput to remove the negative value check
        while (true) {
            System.out.print(prompt);
            try {
                double value = sc.nextDouble();
                return value;
            } catch (InputMismatchException e) {
                System.out.print("Invalid entry! Please enter a numeric value: ");
                sc.next(); // consume the invalid input
            }
        }
    }
    
    public static double calculateExpenses(double expense, double budget) // extra method to calculate budget after expenses
    {
        double amountAfterAll = budget - expense;
        return amountAfterAll;
    }
}
