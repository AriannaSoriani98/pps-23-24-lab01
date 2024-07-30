import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tdd.CircularList;
import tdd_3.CircularListFilter;
import tdd_3.CircularListFilterIImpl;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CircularListFilterTest {
    private CircularListFilter list = new CircularListFilterIImpl();

    @Test
    void testFilteredNextElement() {
        this.list.add(1);
        this.list.add(2);
        assertEquals(Optional.of(2), this.list.filteredNext(element -> element.equals(2)));
    }

    @Test
    void testFilteredNextWithWrongCondition() {
        this.list.add(1);
        assertEquals(Optional.empty(), this.list.filteredNext(element -> false));
    }

    @Test
    void testFilteredNextWithEmptyList() {
        assertEquals(Optional.empty(), this.list.filteredNext(element -> element==1));
    }
}
