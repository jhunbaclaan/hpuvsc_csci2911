package week15;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class classwork3_4_20_2023 {
    @Test
    public void testSumTwoPlusThreeEqualsFive()
    {
        System.out.println("sum");
        int num1 = 2;
        int num2 = 3;
        Operations instance = new Operations();
        int expectedResult = 5;
        int result = instance.sum(num1, num2);
        assertEquals(expectedResult, result);
    }

    @Test
    public void testSumThreePlusNEgaiveTwoEqualsOne()
    {
        System.out.println("sum");
        int num1 = 3;
        int num2 = -2;
        Operations instance = new Operations();
        int expectedResult = 1;
        int result = instance.sum(num1, num2);
        assertEquals(expectedResult, result);
    }

    @Test
    public void testMultiplyTwoTimesTwoEqualsFour()
    {
        System.out.println("multiply");
        double num1 = 2;
        double num2 = 2;
        Operations instance = new Operations();
        double expectedResult = 4;
        double result = instance.multiply(num1, num2);
        assertEquals(expectedResult, expectedResult, result);
    }
}
