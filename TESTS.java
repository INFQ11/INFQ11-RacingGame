// Max E.

import ea.*;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TESTS
{
    @BeforeEach
    public void setUp()
    {
    }

    @Test
    public void methodSummary()
    {
        assertEquals(1,1);
        assertTrue(true);
        assertFalse(false);
        assertNull(null);
        assertNotNull(null);
        assertThrows(UnsupportedOperationException.class, () -> {} );
        fail("Message");
        assertArrayEquals(new int [] {}, new int [] {});
    }
}
