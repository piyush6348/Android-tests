package practice.tests;

/**
 * Created by piyush on 2/10/17.
 */

import org.junit.Test;

import static org.junit.Assert.*;

import static practice.tests.MainActivity.*;

public class MainActivityUnitTest {

    @Test
    public void calcWorks(){
        assertEquals(50,calcFare(0,0),0.0001);
    }
}
