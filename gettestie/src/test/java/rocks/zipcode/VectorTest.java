package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Vector;

public class VectorTest {

    @Test
    public void sizeTest() {

        //Given
        Vector<Integer> vector = new Vector<>();
        for(int i = 0; i < 50; i++) {
            vector.add(i);
        }

        Integer expected = 50;
        Integer actual = vector.size();

        // Then
        Assert.assertEquals(expected, actual);
    }
}
