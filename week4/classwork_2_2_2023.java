package week4;

/*
 * code copied from class
 */
import java.io.*;
import java.util.*;
public class classwork_2_2_2023 {
    public static void main (String [] main) throws FileNotFoundException
    {
        // similar to creating an arraylist, but in a file
        PrintWriter fileOut = new PrintWriter("Names.txt");
        fileOut.println(4.32); // add an element in line 0
        fileOut.println(6.32);
        fileOut.print(4921.34);
        fileOut.close();

        // opens file to read
        File file = new File("Names.txt");
        Scanner fileIn = new Scanner(file);

        // iterate through all file lines
        while (fileIn.hasNext())
        {
            double number = fileIn.nextDouble();
            System.out.println(number);
            double upPrice = number * 1.1;
            System.out.printf("if price goes up by 10 percent, you pay $%.2f\n\n", upPrice);
        }

        fileIn.close();
    }
}
