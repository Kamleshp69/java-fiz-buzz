package com.skpsystems.fizzbuzz;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        for (int i = 1; i < 101; i++) {
            System.out.println((deriveFizzBuzz(i)));
        }
    }

    public static String deriveFizzBuzz(int value) {
        String tmp = "";
        if (isFizz(value) && isBuzz(value))
            tmp = "FizzBuzz";
        else if (isFizz(value))
            tmp = "Fizz";
        else if (isBuzz(value))
            tmp = "Buzz";
        else
            tmp = Integer.toString(value);


        return tmp;
    }

    public static boolean isFizz(int value) {
        return (value % 3 == 0 || Integer.toString(value).contains("3"));
    }

    public static boolean isBuzz(int value) {
        return (value % 5 == 0 || Integer.toString(value).contains("5"));
    }
}
