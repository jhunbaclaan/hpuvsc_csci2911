package week11.assignment3;

import java.util.*;
import java.math.*; // bigdecimal and roundingmode imports to make sure price is consistent
public class assignment3_3_21_2023 {
    public static void main(String[] args)
    {
        // initialization
        String name, description;
        int units, productID;
        double price;
        Product P1001 = new Product();
        Product P1002 = new Product("Hat", "Brown Tiki Hat", 56, 9.99);
        Product P1003 = new Product("Towel", "Shark Beach Towel", 29, 12.50);
        Product P1004 = new Product("Scarf", "Hibiscus scarf", 50, 16.75);
        Scanner sc = new Scanner(System.in);
        // run
        System.out.println("Malia's Hawaiian Shop");
        System.out.print("Enter product name: ");
        name = sc.nextLine();
        P1001.setName(name);
        System.out.print("Enter description: ");
        description = sc.nextLine();
        P1001.setDescription(description);
        while (true)
        {
            try{
                System.out.print("Enter units on hand (whole number input only): ");
                units = sc.nextInt();
                P1001.setUnitsAmount(units);
                break;
            }
            catch (InputMismatchException e)
            {
                System.out.println("Please enter a whole number input !!");
                sc.nextLine();
            }
        }
        while (true)
        {
            try{
                System.out.print("Enter price: ");
                price = sc.nextDouble();
                sc.nextLine();
                break;
            }
            catch (InputMismatchException e)
            {
                System.out.println("Please enter a valid price!");
                sc.nextLine();
            }
        }
        /*
         * formats the price input using BigDecimal and RoundingMode
         * BigDecimal is similar to printf, in a sense that you can select how many decimal places there are
         * RoundingMode rounds the number: HALF_UP rounds >=5 up (e.g. 1.56 is rounded to 1.6)
         */
        BigDecimal bd = new BigDecimal(price).setScale(2, RoundingMode.HALF_UP);
        double newPrice = bd.doubleValue();
        P1001.setPrice(newPrice);
        System.out.println(); // whitespace
        System.out.println(P1001.toString());
        
    }
}
