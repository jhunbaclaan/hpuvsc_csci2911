package week8;

import java.util.*;
public class classwork2_2_28_2023 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String input;
        boolean valid;

        System.out.print("Enter your SSN; Format should be ###-##-#### : ");
        input = sc.nextLine();

        valid = customerNumberMatches(input);

        System.out.println("Valid SSN: " + valid);
    }

    private static boolean customerNumberMatches(String input)
    {
       return input.matches("[0-9]{3}-[0-9]{2}-[0-9]{4}");
    }
}
