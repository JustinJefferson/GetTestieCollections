package rocks.zipcode;

import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;

import static org.junit.Assert.*;

public class LinkedListTest {

    @Test
    public void pollTest() {

        //Given
        Queue<String> queue = new LinkedList<>();

        //Then
        assertNull(queue.poll());
    }

    @Test
    public void addThenPoll() {

        //Given
        Queue<String> queue = new LinkedList<>();
        String expected1 = "Cat";
        String expected2 = "Long";
        String expected3 = "Robin";

        //When
        queue.add(expected1);
        queue.add(expected2);
        queue.add(expected3);

        //Then
        assertEquals(expected1, queue.poll());
        assertEquals(expected2, queue.poll());
        assertEquals(expected3, queue.poll());
        assertNull(queue.poll());


    }
}
