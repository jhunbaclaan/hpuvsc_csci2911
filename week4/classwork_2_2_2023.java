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
        fileOut.println("Chris"); // add an element in line 0
        fileOut.println("Kathryn");
        fileOut.print("Jean");
        fileOut.close();

        // opens file to read
        File file = new File("Names.txt");
        Scanner fileIn = new Scanner(file);

        // iterate through all file lines
        while (fileIn.hasNextLine())
        {
            String str = fileIn.nextLine();
            System.out.println(str);
        }

        fileIn.close();
    }
}
