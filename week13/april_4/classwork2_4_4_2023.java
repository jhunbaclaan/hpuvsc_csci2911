package week13.april_4;

import java.util.*;
public class classwork2_4_4_2023 {
    public static void main (String[] args)
    {
        int[] numbers = {4, 9, 20, 21, 43, 10};
        Arrays.sort(numbers);

        int target = Arrays.binarySearch(numbers, 21);
        if (target < 0)
        {
            System.out.println("number is not found in array");
        }
        else
        {
            System.out.println("number is found in array");
        }
    }
}
