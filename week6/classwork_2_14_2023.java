package week6;
/*
 * simple area calculator with a method and try-catch block
 * created by: jhun baclaan
 * d.o.c: feb. 14, 2023
 */
import java.util.*;
public class classwork_2_14_2023 {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int length, width;
        while (true)
        {
            try{ // input validation via try-catch, catches 'InputMismatchException' errors which happens if you don't input an integer value
                System.out.print("What is the length of your rectangle? ");
                length = sc.nextInt();
                System.out.print("What is the width of your rectangles? ");
                width = sc.nextInt();
                break; // if both are integers, break
            }
            catch (InputMismatchException e) // prevents errors from happening if you enter a string instead of an int. note that 'e' refers to 'exception'
            {
                System.out.println("Please enter a valid integer. ");
                sc.nextLine(); // makes the user re-input both length and width
            }

        }
        System.out.println("The area of your rectangle is " + calculateArea(length, width) + " square units.");
    }

    public static int calculateArea(int x, int y)
    {
        int area = x*y;
        return area;
    }
}
