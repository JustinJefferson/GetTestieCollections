package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Stack;

public class StackTest {

    @Test
    public void stackTest() {

        // Given
        Stack<String> stack = new Stack<>();
        String string = "Foo";
        stack.push(string);
        stack.push("Fizz");
        stack.push("Buzz");
        stack.push("Butt");

        //When
        Integer expected = 4;
        Integer actual = stack.search(string);

        //Then
        Assert.assertEquals(expected, actual);
    }
}
