package za.ac.cput;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class KamaludienSondayTest {
    private KamaludienSonday stud1;
    private KamaludienSonday stud2;
    private KamaludienSonday stud3;
    private KamaludienSonday stud4;

    @BeforeEach
    void setUp() {
        stud1 = new KamaludienSonday("Jack", 20);
        stud2 = new KamaludienSonday("Jack", 20);
        stud3 = stud1;
        stud4 = new KamaludienSonday("John", 21);


    }

    //Test for object equality.
    @Test
    void testEquality() {
        assertEquals(stud1, stud3);
        assertNotEquals(stud1, stud2);
    }

    //Test for object identity.
    @Test
    void testIdentity() {
        assertSame(stud1, stud3);
        assertNotSame(stud1, stud2);
    }

    //Failing test
    @Test
    void failingTest() {
        String str1 = stud1.getName();
        String str2 = stud2.getName();
        assertEquals(str1, str2);
        fail("Forcing the test method to fail");
    }

    //Timeout test
    @Test
    @Timeout(value = 1000, unit = TimeUnit.MILLISECONDS)
    void timeoutTest() {
        String str3 = stud1.getName();
        String str4 = stud2.getName();
        assertEquals(str3, str4);

    }

    //Disabling test
    @Disabled("Disabling the test method")
    @Test
    void disablingTest() {
        assertEquals(stud1, stud2);
    }
}