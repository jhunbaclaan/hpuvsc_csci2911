package week6;
/*
 * easy guessing game program :p
 * d.o.c: feb 16, 2023
 * created by: jhun baclaan
 */
import java.util.*;
public class classwork_2_16_2023 {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int randomNum = compRandom();
        // System.out.println(randomNum); // test if it makes a random number
        int userInput = getInput(sc);
        isMatching(userInput, randomNum);
    }

    public static int compRandom()
    {
        Random rand = new Random();
        int x = rand.nextInt(100) + 1;
        return x;
    }

    public static int getInput(Scanner sc)
    {
        System.out.println("guess the number the computer generated (1 - 100): ");
        int input = inputValidation(sc);
        return input;
    }

    public static boolean isMatching(int input, int random)
    {
        if(input == random)
        {
            System.out.println("CORRECT!");
            return true;
        }
        else
        {
            System.out.println("INCORRECT!");
            return false;
        }
    }

    public static int inputValidation(Scanner sc)
    {
        while(!sc.hasNextInt())
        {
            System.out.print("please enter a number only! ");
            sc.next();
        }
        int input = sc.nextInt();
        return input;
    }
}
