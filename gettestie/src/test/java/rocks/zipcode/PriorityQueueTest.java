package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.PriorityQueue;

public class PriorityQueueTest {

    @Test
    public void orderTest() {

        // Given
        PriorityQueue<String> priority = new PriorityQueue<>();
        String expected = "A";
        priority.add("becd");
        priority.add("Game");
        priority.add("Lulu");
        priority.add(expected);

        //When
        String actual = priority.poll();

        //Then
        Assert.assertEquals(expected, actual);
    }
}
