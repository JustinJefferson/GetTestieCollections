package rocks.zipcode;

import org.junit.Test;

import java.util.HashSet;

import static org.junit.Assert.*;

public class HashSetTest {

    @Test
    public void isSetTest() {

        //Given
        HashSet<String> hashSet = new HashSet<>();

        //When
        hashSet.add("Cat");
        hashSet.add("Dog");
        hashSet.add("Cat");
        Integer expected = 2;
        Integer acutal = hashSet.size();

        //Then
        System.out.println(hashSet);
        assertEquals(expected, acutal);

    }

    @Test
    public void removeTest() {

        //Given
        HashSet<Integer> hashSet = new HashSet<>();

        //When
        for(int i = 1; i <= 10; i ++) {
            hashSet.add(i);
        }
        hashSet.remove(7);

        //Then
        System.out.println(hashSet);
        assertFalse(hashSet.contains(7));

    }
}
