package za.ac.cput;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertNotSame;

class SharfaaSATest {
    private SharfaaSA converter1;
    private SharfaaSA converter2;
    private SharfaaSA converter3;
    private SharfaaSA converter4;

    @BeforeEach
    void setUp(){
        converter1 = new SharfaaSA(12,"C");
        converter2 = new SharfaaSA(12,"C");
        converter3 = converter1;
        converter4 = new SharfaaSA(40,"F");
    }

    @Test
    void testEquality(){
        assertEquals(converter1,converter3);
        assertNotEquals(converter1,converter2);

    }

    //Testing for object identity.
    @Test
    void testIdentity(){
        assertSame(converter1,converter3);
        assertNotSame(converter1,converter2);
    }

    @Test
    void failingTest(){

        String string3 = converter1.temperatureConverter();
        String string4 = converter2.temperatureConverter();
        assertEquals(string3,string4);
        fail("Purposefully failing test.");
    }

    @Test
    @Timeout(value = 1000,unit = TimeUnit.MILLISECONDS)
    void timeoutTest(){
        String string1 = converter1.temperatureConverter();
        String string2 = converter2.temperatureConverter();
        assertEquals(string1,string2);

    }

    //Disabling Test
    @Disabled("Going to fail, so I disabled it.")
    @Test
    void disabledTest(){
        assertEquals(converter1,converter2);
    }
}