package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.TreeSet;

public class TreeSetTest {

    @Test
    public void lowerThanTest() {

        //Given
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(4);
        treeSet.add(2);
        treeSet.add(29);
        treeSet.add(20);
        treeSet.add(1);

        //When
        Integer expected = 4;
        Integer actual = treeSet.lower(20);

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void higherThanTest() {

        //Given
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(4);
        treeSet.add(2);
        treeSet.add(29);
        treeSet.add(20);
        treeSet.add(1);

        //When
        Integer expected = 29;
        Integer actual = treeSet.higher(20);

        //then
        Assert.assertEquals(expected, actual);
    }
}
