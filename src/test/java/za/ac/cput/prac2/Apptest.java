package za.ac.cput.prac2;

import junit.framework.Assert;
import junit.framework.TestCase;


/**
 * Created by student on 2015/02/10.
 */
public class Apptest extends TestCase {


    public void testInt() throws Exception {
        App myApp = new App();
        assertEquals("13",myApp.testInt());
    }
}
