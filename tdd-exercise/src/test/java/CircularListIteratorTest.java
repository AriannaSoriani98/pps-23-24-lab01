import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tdd_2.CircularListIteratorImpl;

import static org.junit.jupiter.api.Assertions.*;

public class CircularListIteratorTest {
    private CircularListIteratorImpl circularListIterator;

    @BeforeEach
    void beforeEach() {
        this.circularListIterator = new CircularListIteratorImpl();
    }

    @Test
    void testAdd() {
        this.circularListIterator.add(1);
        assertEquals(1, this.circularListIterator.size());
    }

    @Test
    void testSizeIsInitiallyZero() {
        assertEquals(0, this.circularListIterator.size());
    }

    @Test
    void testSize() {
        this.circularListIterator.add(1);
        this.circularListIterator.add(2);
        assertEquals(2, this.circularListIterator.size());
    }

    @Test
    void testIsEmpty() {
        assertTrue(this.circularListIterator.isEmpty());
    }

    @Test
    void testForwardIteratorWithEmptyList() {
        assertFalse(this.circularListIterator.forwardIterator().hasNext());
    }

    @Test
    void testForwardIterator() {
        this.circularListIterator.add(1);
        this.circularListIterator.add(2);
        assertEquals(2, this.circularListIterator.forwardIterator().next());
    }

    @Test
    void testBackwardIteratorWithEmptyList() {
        assertFalse(this.circularListIterator.backwardIterator().hasNext());
    }

    @Test
    void testBackwardIterator() {
        this.circularListIterator.add(1);
        this.circularListIterator.add(2);
        assertEquals(2, this.circularListIterator.backwardIterator().next());
    }

    @Test
    void testReset() {
        this.circularListIterator.add(1);
        this.circularListIterator.add(2);
        this.circularListIterator.reset();
        assertEquals(0, this.circularListIterator.size());
    }
}
