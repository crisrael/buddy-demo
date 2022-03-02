import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BuddyDemoTest {

    @Test
    public void addTwoIntegers() {
        BuddyDemo test = new BuddyDemo();
        assert(test.addTwoIntegers(3,3) == 6);
    }

    @Test
    public void returnTrue() {
        BuddyDemo test = new BuddyDemo();
        assertTrue(test.returnTrue());
    }

    @Test
    public void getFirstCharacter() {
        BuddyDemo test = new BuddyDemo();
        char c = 's';
        assertSame(test.getFirstCharacter("string"), c);
    }
}