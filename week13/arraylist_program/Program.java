package week13.arraylist_program;

import java.util.*;
public class Program {
    // made arraylist private static to prevent any problems with my methods
    private static ArrayList<String> names = new ArrayList<String>();
    public Program()
    {
        boolean running = true;
        Scanner sc = new Scanner(System.in);
        while (running)
        {
            menu(sc);
        }
        
    }

    public static void menu(Scanner sc)
    {
        int selection = 0;
        System.out.println("=-=-=-=- the names menu -=-=-=-=");
        System.out.println("1. Add Names");
        System.out.println("2. Print out all names");
        System.out.println("3. Search for name in the list");
        System.out.println("4. Print out all names sorted");
        System.out.println("5. How many names are in the list?");
        System.out.println("6. Exit");
        System.out.println("-=-=-=-=-=-=-=-");
        System.out.print("Enter your selection from 1-6: ");
        while (true)
        {
            try{
                selection = sc.nextInt();
                sc.nextLine();
                break;
            }
            catch (InputMismatchException e)
            {
                System.out.println("Invalid. Please make a selection from 1-6!");
                sc.nextLine();
            }
        }
        if (selection == 1)
        {
            addNames(sc, names);
            System.out.println(); // whitespace
        }
        else if (selection == 2)
        {
            System.out.print(printNames(names));
            System.out.println(); // whitespace
        }
        else if (selection == 3)
        {
            searchName(names, sc);
            System.out.println(); // whitespace
        }
        else if (selection == 4)
        {
            printSortedNames(names);
            System.out.println(); // whitespace
        }
        else if (selection == 5)
        {
            System.out.println("There are " + amountOfNames(names) + " names in the list.");
            System.out.println(); // whitespace
        }
        else
        {
            System.out.println("Thank you for using my program!");
            System.out.println("Goodbye!");
            sc.close();
            System.exit(0);

        }
    }
    /*
     * adds names by asking the user how many names they want to input (stored in amount)
     * then asking for input for every name they want to input
     * input validation via try catch 
     */
    public static void addNames(Scanner sc, final ArrayList<String> names)
    {
        int amount = 0;
        while (true)
        {
            try{
                System.out.print("How many names would you like to add? ");
                amount = sc.nextInt();
                sc.nextLine();
                break;
            }
            catch (InputMismatchException e)
            {
                System.out.println("Invalid. Please enter an integer only.");
                sc.nextLine();
            }
        }
        for (int i = 0; i < amount; i++)
        {
            System.out.print("Enter name " + (i + 1) + ": ");
            names.add(sc.nextLine());
        }
    }
    public static String printNames(final ArrayList<String> names)
    {
        String output = "";
        for (String s : names)
        {
            output += s + "\n";
        }
        return output;
    }
    public static void searchName(final ArrayList<String> names, Scanner sc)
    {
        String name = "*";
        System.out.print("What name are you looking for? ");
        name = sc.nextLine();
        if (names.contains(name))
        {
            System.out.println(name + " is in the list.");
        }
        else
        {
            System.out.println(name + " is not in the list.");
        }
    }
    public static void printSortedNames(final ArrayList<String> names)
    {
        Collections.sort(names);
        for (String s : names)
        {
            System.out.println(s);
        }
    }
    public static int amountOfNames(final ArrayList<String> names)
    {
        return names.size();
    }
}
