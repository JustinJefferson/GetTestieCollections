package rocks.zipcode;

import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class HashMapTest {

    @Test
    public void replaceTest() {

        //Given
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Building");

        //When
        String expected = "Wilmington";
        hashMap.replace(1, expected);

        //THen
        assertEquals(expected, hashMap.get(1));

    }

    @Test
    public void putIfAbsentTest() {

        //Given
        HashMap<Integer, String> hashMap = new HashMap<>();
        String expected = "TWO";
        hashMap.put(2, expected);

        //When
        hashMap.putIfAbsent(2, "Two");

        //Then
        assertEquals(expected, hashMap.get(2));
    }
}
