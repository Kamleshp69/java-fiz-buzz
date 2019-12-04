package com.skpsystems.fizzbuzz;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

    //3
    public void test3IsFizz() {
        assertEquals("Fizz", App.deriveFizzBuzz(3));
    }

    //9
    public void test9IsFizz() {
        assertEquals("Fizz", App.deriveFizzBuzz(9));
    }

    //5
    public void test5sBuzz() {
        assertEquals("Buzz", App.deriveFizzBuzz(5));
    }

    //15
    public void test15isFizzBuzz() {
        assertEquals("FizzBuzz", App.deriveFizzBuzz(15));
    }

    //1
    public void test1IsNotFizzOrBuzz() {
        assertEquals("1", App.deriveFizzBuzz(1));
    }

    //13
    public void test13IsFizz() {
        assertEquals("Fizz", App.deriveFizzBuzz(13));
    }

    //51
    public void test51IsBuzz() {
        assertEquals("FizzBuzz", App.deriveFizzBuzz(51));
    }
    //52
    public void test52IsBuzz() {
        assertEquals("Buzz", App.deriveFizzBuzz(52));
    }

    //53
    public void test53IsFizzBuzz() {
        assertEquals("FizzBuzz", App.deriveFizzBuzz(53));
    }
}
