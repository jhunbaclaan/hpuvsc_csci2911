package week15;

import org.junit.*;
public class classwork2_4_18_2023 {
    @Test 
    public void testIsEvenNumberOne()
    {
        System.out.println("isEvenNumber");
        int number = 1;
        EvenOdd instance = new EvenOdd();
        boolean expResult = true;
        boolean result = instance.isEvenNumber(number);
        assertEquals(expResult, result);
    }

    @Test 
    public void testIsEvenNumberThree()
    {
        System.out.println("isEvenNumber");
        int number = 5;
        EvenOdd instance = new EvenOdd();
        boolean expResult = true;
        boolean result = instance.isEvenNumber(number);
        assertEquals(expResult, result);
    }

    

    public static boolean assertEquals(boolean one, boolean two)
    {
        if (one == two)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
