package week7;

import java.util.regex.Pattern;

public class regex {
    public static void main(String[] args)
    {
        // problem 1
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "redvox")); // any alphanumeric characters put into a string of length 6
        System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "7123456789")); // one starting character of 7 8 or 9, and 9 chars of anything 0-9
    }
}
