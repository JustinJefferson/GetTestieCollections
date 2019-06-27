package rocks.zipcode;

import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Deque;

import static org.junit.Assert.*;

public class ArrayDequeTest {

    @Test
    public void queueDequeTest() {

        // Given
        Deque<String> deque = new ArrayDeque<>();
        String first = "Summer";
        String last = "Winter";

        // When
        deque.add(first);
        deque.add("Fall");
        deque.add("Spring");
        deque.add(last);
        String actualFirst = deque.pollFirst();
        String actualLast = deque.pollLast();
        Integer expectedSize = 2;
        Integer actualSize = deque.size();

        // Then
        assertEquals(first, actualFirst);
        assertEquals(last, actualLast);
        assertEquals(expectedSize, actualSize);

    }

    @Test
    public void addFirstandLastTest() {

        // Given
        Deque<String> deque = new ArrayDeque<>();
        String first = "Summer";
        String last = "Winter";

        // When

        deque.add("Fall");
        deque.add("Spring");
        deque.addLast(last);
        deque.addFirst(first);
        String actualFirst = deque.pollFirst();
        String actualLast = deque.pollLast();
        Integer expectedSize = 2;
        Integer actualSize = deque.size();

        // Then
        assertEquals(first, actualFirst);
        assertEquals(last, actualLast);
        assertEquals(expectedSize, actualSize);

    }
}
