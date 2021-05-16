import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class KitchenTest {

    Kitchen emptyKitchen;
    Kitchen kitchenWithOne;
    Kitchen kitchenWithMany;

    @Before
    public void setup() {
        emptyKitchen = new Kitchen();

        kitchenWithOne = new Kitchen();
        kitchenWithOne.add("yellow corn");

        kitchenWithMany = new Kitchen();
        kitchenWithMany.add("blue corn");
        kitchenWithMany.add("yellow corn");
        kitchenWithMany.add("yellow corn");
        kitchenWithMany.add("white corn");
    }

    @Test
    public void testIfKitchenIsEmpty() {
        assertTrue(emptyKitchen.isEmpty());
        assertFalse(kitchenWithOne.isEmpty());
        assertFalse(kitchenWithMany.isEmpty());
    }

    @Test
    public void testIfAddWorks() {
        assertTrue(emptyKitchen.isEmpty());
        emptyKitchen.add("white corn");
        assertFalse(emptyKitchen.isEmpty());
    }

    @Test
    public void testIfPopWorks() {
        assertFalse(kitchenWithOne.isEmpty());
        kitchenWithOne.pop();
        assertTrue(emptyKitchen.isEmpty());
    }

    @Test
    public void testIfSizeWorks() {
        assertEquals(0, emptyKitchen.size());
        assertEquals(1, kitchenWithOne.size());
        assertEquals(4, kitchenWithMany.size());
    }

    @Test
    public void testIfContainsWorks() {
        assertFalse(emptyKitchen.contains("white corn"));
        assertTrue(kitchenWithOne.contains("yellow corn"));
        assertTrue(kitchenWithMany.contains("blue corn"));
    }

}
