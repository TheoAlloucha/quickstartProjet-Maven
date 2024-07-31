package com.org;


import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.testng.Assert;

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
    public void testConvertToJson() {
        Person person = new Person("Jane", "Doe");
        String json = App.convertToJson(person);
        Assert.assertTrue(json.contains("Jane") && json.contains("Doe"));
        }
    public void testCapitalizeString() {
        String input = "hello world";
        String result = App.capitalizeString(input);
        Assert.assertEquals(result, "Hello world");
    }
}
