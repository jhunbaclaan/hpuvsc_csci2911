/*
 * a program that intends to test string methods
 * all code is copied from class
 * created by: jhun baclaan
 * d.o.c: jan 19, 2023
 */
import java.util.*;
public class classwork_1_19_2023 {
    public static void main(String[] args)
    {
        String myName = "june";
        String yourName = "June";

        if (myName.equals(yourName))
        {
            System.out.println("same name!");
        }

        if (myName.equalsIgnoreCase(yourName))
        {
            System.out.println("same name (when using equalsIgnoreCase)");
        }

        String message = "Java is Great Fun";
        String upperMessage = message.toUpperCase();
        System.out.println(upperMessage);
        String lowerMessage = message.toLowerCase();

        char letter = message.charAt(2);
        int stringSize = message.length();

        System.out.println(lowerMessage + " is " + message + " in lowercase");
        System.out.println(stringSize + " is the length of " + message);
        System.out.println(letter + " is the letter at index 2");

        Random rand = new Random();
        String size;
        //for (int i = 0; i < 5; i++)
        //{
            int number = rand.nextInt(3) + 1;

            if (number == 1)
            {
                size = "small";
            }
            else if (number == 2)
            {
                size = "medium";
            }
            else
            {
                size = "large";
            }

            System.out.println(number);
            System.out.println(size);
        //}
    }
}
