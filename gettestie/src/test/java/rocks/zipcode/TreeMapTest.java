package rocks.zipcode;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapTest {

    @Test
    public void orderTest() {

        //Given
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(5, "Cat");
        treeMap.put(1, "Dog");
        treeMap.put(3, "Alpaca");
        treeMap.put(2, "Parrot");
        treeMap.put(4, "Fish");

        //When
        Integer expectedFirst = 1;
        Integer actualFirst = treeMap.firstKey();
        Integer expectedCeiling = 5;
        Integer actualCeiling = treeMap.lastKey();

        //Then
        assertEquals(expectedFirst, actualFirst);
        assertEquals(expectedCeiling, actualCeiling);

    }

    @Test
    public void comparatorTest() {

        //Given
        Comparator<Integer> highToLow = Comparator.reverseOrder();
        TreeMap<Integer, String> treeMap = new TreeMap<>(highToLow);
        treeMap.put(5, "Cat");
        treeMap.put(1, "Dog");
        treeMap.put(3, "Alpaca");
        treeMap.put(2, "Parrot");
        treeMap.put(4, "Fish");

        //When
        Integer expectedFirst = 5;
        Integer actualFirst = treeMap.firstKey();
        Integer expectedCeiling = 1;
        Integer actualCeiling = treeMap.lastKey();

        //Then
        assertEquals(expectedFirst, actualFirst);
        assertEquals(expectedCeiling, actualCeiling);

    }
}
