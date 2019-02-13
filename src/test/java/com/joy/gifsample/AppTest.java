package com.joy.gifsample;

import com.joy.gifsample.controller.HomeController;
import junit.framework.TestCase;
import org.junit.Test;

public class AppTest extends TestCase {

    @Test
    public void testApp(){
        HomeController hc = new HomeController();
        String result = hc.home();
        assertEquals(result, "Welcome Home!");
    }
}
