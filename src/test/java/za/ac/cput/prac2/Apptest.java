package za.ac.cput.prac2;

import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.*;

public class Apptest extends TestCase {
    App myApp = new App();
    App myApp2 = myApp;

    @BeforeClass
    public static void beforeClass() {

        System.out.println("In before class");
    }

    @Test
    public void testFloat() throws Exception {

        Assert.assertTrue(myApp.getFloat() == 125.0);
    }

    @Test
    public void testInt() throws Exception{
        Assert.assertEquals(myApp.getInt(), 12);
    }


    @Test
    public void testObj() throws Exception{
        Assert.assertSame(myApp.getObj(), "thabo");
    }

    @Test
    public void testObjId() throws Exception{
        Assert.assertSame(myApp, myApp2);
    }

     @Test
     public void testTrue() throws Exception{
         Assert.assertEquals(myApp.getTruth(), true);
     }

    @Test
    public void testFalse() throws Exception{
        Assert.assertEquals(myApp.getFalse(), false);
    }

    @Test
    public void testNull() throws Exception{
        Assert.assertNull(myApp.getNull(), null);
    }

    @Test
    public void testNotNull() throws Exception {
        Assert.assertNotNull(myApp.getNull(), "thabo");
    }

     @Test
     public void testFail() throws Exception {
         //Assert.fail("fail test");
     }

    @Test
    public void testArray() throws Exception{
        int [] myArray2 = {1,2,3,4,5};

       // Assert.assertArrayEquals(myApp.getArray(),myArray2);
    }

    @Test (timeout = 9000)
    public void timeTest()throws Exception{
        double ans = myApp.getTimeOut(12,2);
    }

    @AfterClass
    public static void afterClass() {

        System.out.println("In after class");
    }
}
