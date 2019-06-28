package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;
import java.util.TreeSet;

public class IteratorTest {

    @Test
    public void nextRemoveTest() {

        //Given
        TreeSet<Integer> treeSet = new TreeSet<>();
        for(int i = 1; i <= 10; i++) {
            treeSet.add(i);
        }
        Iterator<Integer> iterator = treeSet.iterator();

        //When
        while(iterator.hasNext()) {
            Integer num = iterator.next();
            if(num % 2 == 0) iterator.remove();
        }

        System.out.println(treeSet);

        Iterator<Integer> iterator1 = treeSet.iterator();

        while(iterator1.hasNext()) {
            Boolean check = (iterator1.next() % 2 != 0);
            Assert.assertTrue(check);
        }

    }
}
