package rocks.zipcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.TreeMap;

import static org.junit.Assert.*;

public class ArrayListTest {

    @Test
    public void collectionAddTest() {

        //Given
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList< Integer> linkedList = new LinkedList<>();
        for(int i = 0; i < 20; i++) {
            linkedList.add(i);
        }

        //When
        arrayList.addAll(linkedList);

        //Then
        for(int i = 0; i < linkedList.size(); i++) {
            assertTrue(arrayList.contains(linkedList.get(i)));
        }
    }

    @Test
    public void retainTest() {

        //Given
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> retainList = new ArrayList<>();
        for(int i = 1; i <= 100; i++) {
            arrayList.add(i);
            if(i % 5 == 0) retainList.add(i);
        }

        //When
        arrayList.retainAll(retainList);

        //Then
        assertEquals(arrayList, retainList);
    }
}
