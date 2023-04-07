package week13;

import java.util.*;
public class classwork_4_6_2023 {
    public static void main(String[] args)
    {
        int[] numbers = {4, 48, 5, 58, 7, 76};
        System.out.println("unorganized numbers");
        for (int i : numbers)
        {
            System.out.println(i);
        }
        System.out.println(); // whitespace

        Arrays.sort(numbers);
        System.out.println("organized numbers");
        for (int i : numbers)
        {
            System.out.println(i);
        }
    }
}
