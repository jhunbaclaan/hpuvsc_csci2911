/*
 * a program that:
 1. lets the user choose a type of chip (taro, poi, ube)
 2. lets the user input amount of chips eaten (limited)
 3. calculate chips, calories per chip, number eaten, total calories
 4. return total calories consumed
 * created by: jhun baclaan
 * d.o.c: jan 24, 2023
 */
package week3;

import java.util.*;
public class assignment_1_24_2023 {
    public static void main(String[] args)
    {
        // declaration
        ArrayList<String> chipList = new ArrayList<String>(); // taking this from week 2 lab...
        Scanner sc = new Scanner(System.in);
        String chip;
        int numericalInput;
        double numberEaten, chipsInBag, servings, caloriesPerServing, caloriesPerChip, totalCalories;

        // populate arraylist
        chipList.add("Taro");
        chipList.add("Poi");
        chipList.add("Ube");

        // run
        System.out.println(); // whitespace
        System.out.println("-=-=-=-chip calorie counter-=-=-=-");
        System.out.println("1. Taro");
        System.out.println("2. Poi");
        System.out.println("3. Ube");
        System.out.println("4. Exit");
        System.out.print("select the type of chip you have eaten (1 for Taro, 2 for Poi, 3 for Ube, and 4 to Exit) ");
        numericalInput = sc.nextInt();
        // input validation (taken from lab 2)
        while ((!(numericalInput >= 1) || !(numericalInput <= 4)))
        {
            System.out.print("please input a valid number! ");
            numericalInput = sc.nextInt();
        }
        if (numericalInput == 1) // taro
        {
            chip = chipList.get(0);
            chipsInBag = 150;
            servings = 10;
            caloriesPerServing = 360;
            System.out.print("how many " + chip + " chips did you eat? " );
            numberEaten = sc.nextInt();
            caloriesPerChip = (caloriesPerServing / (chipsInBag / servings));
            totalCalories = caloriesPerChip * numberEaten;
            System.out.println("type of chip selected: " + chip);
            System.out.println("one chip contains " + caloriesPerChip + " calories.");
            System.out.println("you have consumed: " + totalCalories + " calories.");
            System.out.println();
        }
        else if (numericalInput == 2) // poi
        {
            chip = chipList.get(1);
            chipsInBag = 125;
            servings = 8;
            caloriesPerServing = 550;
            System.out.print("how many " + chip + " chips did you eat? " );
            numberEaten = sc.nextInt();
            caloriesPerChip = (caloriesPerServing / (chipsInBag / servings));
            totalCalories = caloriesPerChip * numberEaten;
            System.out.println("type of chip selected: " + chip);
            System.out.println("one chip contains " + caloriesPerChip + " calories.");
            System.out.println("you have consumed: " + totalCalories + " calories.");
            System.out.println();
        }
        else if (numericalInput == 3) // ube
        {
            chip = chipList.get(2);
            chipsInBag = 100;
            servings = 10;
            caloriesPerServing = 650;
            System.out.print("how many " + chip + " chips did you eat? " );
            numberEaten = sc.nextInt();
            caloriesPerChip = (caloriesPerServing / (chipsInBag / servings));
            totalCalories = caloriesPerChip * numberEaten;
            System.out.println("type of chip selected: " + chip);
            System.out.println("one chip contains " + caloriesPerChip + " calories.");
            System.out.println("you have consumed: " + totalCalories + " calories.");
            System.out.println();
        }
        else // exit
        {
            System.out.println(); // whitespace
            System.out.println("thank you for using the chip calorie counter.");
            System.out.println(); // whitespace
            sc.close();
            System.exit(0); // end program
        }

    }
}
