package week14;

import java.io.*;
import java.util.*;
public class classwork_4_11_2023 {
    public static void main(String[] args) throws FileNotFoundException
    {
        int[] array = createArray("week14/numbers.txt");
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static int[] createArray(String file) throws FileNotFoundException
    {
        File f = new File(file);
        Scanner s = new Scanner(f);
        int c = 0;

        while (s.hasNextInt())
        {
            c++;
            s.nextInt();
        }
        int[] array = new int[c];

        Scanner sc = new Scanner(f);
        for (int i = 0; i < array.length; i++)
        {
            array[i] = sc.nextInt();
        }
        return array;
    }
}
