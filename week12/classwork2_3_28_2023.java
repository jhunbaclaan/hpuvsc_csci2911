package week12;

import java.util.*;
public class classwork2_3_28_2023 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num1 = 33;
        int num2 = 20;

        int[] numbers = new int[5];
        numbers[0] = 23;
        numbers[1] = 18;
        numbers[2] = 9;
        numbers[3] = 2;
        numbers[4] = 33;

        System.out.println(num1);
        System.out.println(numbers[3]);
        int sum = numbers[0] + numbers[3];
        System.out.println("The sum of " + numbers[0] + " + " + numbers[3] + " = " + sum);

        for (int i = 0; i < numbers.length; i++)
        {
            System.out.println(numbers[i]);
        }

        double[] costs = new double[3];
        costs[0] = 3.45;
        costs[1] = 12.50;
        costs[2] = 22.48;

        for (int i = 0; i < costs.length; i++)
        {
            System.out.println("Lunch cost " + (i + 1) + ": $" + costs[i]);
        }

        System.out.println("how many numbers do you want to enter?");
        int howMany = sc.nextInt();

        int[] listOfNumbers = new int[howMany];

        for(int i = 0; i < listOfNumbers.length; i++)
        {
            System.out.print("what is the value for number " + (i + 1) + "? ");
            listOfNumbers[i] = sc.nextInt();
        }
        for(int i = 0; i < listOfNumbers.length; i++)
        {
            System.out.println("entered value number " + (i + 1) + ": " + listOfNumbers[i]);
        }
    }
}
