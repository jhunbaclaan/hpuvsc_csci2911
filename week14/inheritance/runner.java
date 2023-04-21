package week14.inheritance;

import java.util.*;
public class runner {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Dog first = new Dog("Fido" , 3 , "Corgi", 3);
        System.out.println(first.toString());

        Dog second = new Dog();
        System.out.print("What is the name of your dog? ");
        second.setName(sc.nextLine());
        System.out.print("What is the breed of your dog? ");
        second.setBreed(sc.nextLine());
        System.out.print("How old is your dog? ");
        second.setAge(sc.nextInt());
        System.out.print("How long is your dog's tail in inches? ");
        second.setTail(sc.nextDouble());
        System.out.println(); // whitespace
        System.out.println(second.toString());
    }
}
