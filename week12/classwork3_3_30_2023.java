package week12;

public class classwork3_3_30_2023 {
    public static void main(String[] args)
    {
        double[] salesValues = {1000.50,2500,3697.56,8975};
        String days[] = {"monday", "tuesday", "wednesday", "thursday", "friday"};
        double total = 0;

        for (int i = 0; i < salesValues.length; i++)
        {
            total += salesValues[i];
        }
        System.out.println(total);

        System.out.println(addUpDoubleArray(salesValues));
        //System.out.println(salesValues[1]);
        printDoubleArray(salesValues);

        double[] another = {45.69, 45.67, 23.89, 30};
        printDoubleArray(another);
    }

    public static void printDoubleArray(double[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);
        }
    }
    public static void printIntArray (int[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);
        }
    }
    public static double addUpDoubleArray(double [] array)
    {
        double total = 0;
        for (int i = 0; i < array.length; i++)
        {
            total += array[i];
        }
        return total;
    }
}
