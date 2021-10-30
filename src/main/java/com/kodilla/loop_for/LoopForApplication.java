package com.kodilla.loop_for;

class Average
{
    public static void main (String[] args) throws java.lang.Exception
    {
        double[] numbers = {12, 34, 34, 56, 178, 75, 34, 67, 90, 87, 91, 43, 54, 56, 78, 34, 89, 67, 54, 23,};
        double totality = 0.0;
        // int numbersQuantity = numbers.length;

        for (int i = 0; i < numbers.length; i ++)
        {
            System.out.println("Number: [" + (i+1) + "] = " + numbers[i]);

            totality += numbers[i];

        }
        double average = totality / numbers.length;
        System.out.println("Totality: " + totality);
        System.out.println("Average: " + average);

    }
}








