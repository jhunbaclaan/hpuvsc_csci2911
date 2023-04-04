package week13;

import java.util.*;
public class classwork_4_4_2023 {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double[] expenses = new double[7];
        int total = 0;

        for (int i = 0; i < expenses.length; i++)
        {
            System.out.print("how much have you spent for day " + (i + 1) + "? ");
            expenses[i] = sc.nextDouble();
        }
        for (int i = 0; i < expenses.length; i++)
        {
            System.out.println("amount spent for day " + (i + 1) + ": $" + expenses[i]);
        }
        for (int i = 0; i < expenses.length; i++)
        {
            total += expenses[i];
        }
        System.out.println("total of all expenses: $" + total);
        
    }
}
