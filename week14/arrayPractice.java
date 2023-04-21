package week14;

import java.util.*;
import java.io.*;
/*
 * steps are split up into groups of 2 unless stated otherwise
 */
public class arrayPractice {
    public static void main(String[] args)
    {
        // initialization of scanner for arrays
        Scanner sc = new Scanner(System.in);

        // 1 and 2
        String[] friendsArray = new String[5];
        ArrayList<String> friendsArrayList = new ArrayList<String>();

        // 3 and 4
        for (int i = 0; i < friendsArray.length; i++)
        {
            System.out.print("Enter the name of a friend");
            friendsArray[i] = sc.nextLine();
        }
        for (int i = 0; i < 5; i++)
        {
            System.out.print("Enter the name of a friend");
            friendsArrayList.add(sc.nextLine());
        }

        // 5 and 6
        // 5 isnt possible, it goes beyond the set size
        friendsArrayList.add("Burger");

        // 7 and 8
        // 7 isnt possible, you can't remove elements from regular arrays without a complicated process
        friendsArrayList.remove(1);

        // 9 and 10
        System.out.println(friendsArray[2]);
        System.out.println(friendsArrayList.get(2));

        // 11 and 12
        friendsArray[2] = "Dog";
        friendsArrayList.set(2, "Dog");

        // 13 and 14
        System.out.println(friendsArray.length);
        System.out.println(friendsArrayList.size());

        // 15 and 16
        for (int i = 0; i < friendsArray.length; i++)
        {
            System.out.println(friendsArray[i]);
        }
        for (int i = 0; i < friendsArrayList.size(); i++)
        {
            System.out.println(friendsArrayList.get(i));
        }

        // 17 and 18
        Arrays.sort(friendsArray);
        Collections.sort(friendsArrayList);

        // 19 and 20
        for (int i = 0; i < friendsArray.length; i++)
        {
            System.out.println(friendsArray[i]);
        }
        for (int i = 0; i < friendsArrayList.size(); i++)
        {
            System.out.println(friendsArrayList.get(i));
        }

        // demo-ing steps 21 and 22
        printArray(friendsArray);
        printArrayList(friendsArrayList);
        

    }
    // 21 and 22
    public static void printArray(String[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);
        }
    }
    public static void printArrayList(ArrayList<String> arrayList)
    {
        for (int i = 0; i < arrayList.size(); i++)
        {
            System.out.println(arrayList.get(i));
        }
    }
}
