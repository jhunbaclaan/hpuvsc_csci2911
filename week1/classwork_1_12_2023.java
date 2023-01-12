/*
 * a program that intends to:
 1. ask the user for name
 2. asks the user for age
 3. output name & age
 * author: jhun baclaan
 * date of creation: jan. 11, 2023
 */
import java.util.*; // intended for scanner
public class classwork_1_12_2023
{
    public static void main(String[] args)
    {
        // initialization
        Scanner sc = new Scanner(System.in);
        String name = "*";
        int age;

        // accept name + age input + close scanner
        System.out.println("hi! welcome to my program");
        System.out.print("what is your name? ");
        name = sc.nextLine();
        System.out.print("now, how old are you (in years)? ");
        age = sc.nextInt(); // scanner no longer required, should be closed
        sc.close(); // closes scanner (fixes "resource leak" problem)

        // print
        System.out.println("okay! hello " + name + "! you are " + age + " years old!");
        System.out.print("goodbye!");
    }
}
