import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MyFirstTest {
    @Test
    public void myFirstTest() {
        System.out.println("Inside our first test.");
    }

    @Test
    public void testIfCompanyNameEquals() {
        String expected = "Codeup";
        String actual = "Codeup";

        assertEquals(expected, actual);
        assertNotEquals("Douglas", actual);
    }

    @Test
    public void testIfChangeIsCorrect() {
        Double price = 10.0;
        Double discount = 4.5;

        assertEquals(5.5, price - discount, 0);
        assertEquals(5.1, price - discount, 0.5);
        assertNotEquals(4.9, price - discount, 0.5);
    }

    @Test
    public void testIfObjectsAreDifferent() {
        Object dog = new Object();
        Object sheep = new Object();

        Object clonedSheep = sheep;

        assertNotSame(dog, sheep);
        assertSame(sheep, clonedSheep);

        String instructor1 = new String("Douglas");
        String instructor2 = new String("Douglas");

//        assertSame(instructor1, instructor2);  // Not true
        assertEquals(instructor1, instructor2); // true
    }

    @Test
    public void testIfArrayEquals() {
        char[] expected = {'J','u','n','i','t'};
        char[] actual = "Junit".toCharArray();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testIfGreaterOrLesserThanWorks() {

        boolean learningTDD = true;

        assertTrue(learningTDD);
        assertTrue("5 is greater than 4", 5 > 4);
        assertFalse("5 is not greater than 6", 5 > 6);
    }

    @Test
    public void testIfInstanceIsNull() {
        Object phone = new Object();
        Object laptop = null;

        assertNotNull(phone);
        assertNull(laptop);
    }

    @Test
    public void testIfDeviceHasName() {
        Device phone = new Device("iPhone");

        assertEquals("iPhone", phone.getName());
    }

    private List<String> names;

    @Before
    public void setUp() {
        System.out.println("Running setUp");
        this.names = new ArrayList<>();
        this.names.add("Kenneth");
    }

    @Test
    public void testIfNamesIsInitialized() {
        assertNotNull(this.names);
        this.names.add("Douglas");
    }

    @Test
    public void testIfNameHasCorrectNumberOfNames() {
        assertEquals(1, this.names.size());
    }
}
