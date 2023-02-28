package week8;

import java.util.regex.*;
public class classwork_2_28_2023 {
    public static void main (String[] args)
    {
        System.out.println(Pattern.matches("[0-9]{3}-[0-9]{2}-[0-9]{4}", "333-33-3333"));
        System.out.println(Pattern.matches("\\([1-9][0-9]{2}\\)[0-9]{3}-[0-9]{4}", "(808)518-1428"));
    }
}
