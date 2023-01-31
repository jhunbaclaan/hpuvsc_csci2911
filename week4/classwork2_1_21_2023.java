package week4;

import java.util.*;
public class classwork2_1_21_2023 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int books;
        double cost;
        double total = 0;

        System.out.print("how many books did you purchase? ");
        books = sc.nextInt();

        for (int i = 1; i <= books; i++)
        {
            System.out.println("how much does book #" + i + " cost? ");
            cost = sc.nextDouble();
            total = total + cost;
        }
        System.out.println("your total is $" + total);
    }
}
