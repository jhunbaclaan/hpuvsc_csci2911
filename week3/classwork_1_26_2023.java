/*
 * everything in this document was copied from class
 * created by: jhun baclaan
 * d.o.c: jan 26, 2023
 */

package week3;

import java.util.Scanner;

public class classwork_1_26_2023
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        char grade;
        String input;

        System.out.println("coffee is available in three grade");
        System.out.print("which one do you want pricing for? A, B, or C ");
        input = sc.nextLine();

        grade = input.charAt(0);
        
        switch (grade)
        {
            case 'A' :
            case 'a' :
                System.out.println("$30 per pound");
                break;
            case 'B' :
            case 'b' :
                System.out.println("$20 per pound");
                break;
            case 'C' :
            case 'c' :
                System.out.println("$10 per pound");
                break;
            default :
                System.out.println("please enter a valid input!");
        }

        String className = "CSCI 2911";
        int noOfBooks = 2;
        double costOfBook = 35.78;

        System.out.printf("For %s we have %d books at a price of %,.2f\nc", className, noOfBooks, costOfBook);

        String name = "jhun";
        System.out.println(name);

        char letter;
        letter = name.charAt(0);
        System.out.println(letter);
        System.out.println((int)letter);

        for (int i = 0; i < name.length(); i++)
        {
            System.out.println(name.charAt(i));
        }
    }
}