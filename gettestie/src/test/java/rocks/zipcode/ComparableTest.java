package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ComparableTest {

    @Test
    public void sortTest() {

        //Given
        List<Integer> list = new LinkedList<>();
        list.add(100);
        list.add(4);
        list.add(6);
        list.add(1);
        list.add(50);

        //When
        Collections.sort(list);
        Integer expected = 100;
        Integer actual = list.get(4);

        //Then
        Assert.assertEquals(expected, actual);
    }


}
