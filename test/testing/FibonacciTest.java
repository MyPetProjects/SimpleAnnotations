package testing;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.junit.runners.Parameterized.*;

/**
 * Created with IntelliJ IDEA.
 * User: Valentine
 * Date: 06.11.14
 * Time: 17:39
 * To change this template use File | Settings | File Templates.
 */
@RunWith(Parameterized.class)
public class FibonacciTest {
    @Parameters
    public static Iterable<Integer[]> getData() {
        return Arrays.asList(new Integer[][] {{0, 0}, {1, 1}, {2, 1}, {3, 2}, {4, 3}, {5, 5}, {6, 8}});
    }

    private int input;
    private int expected;

    public FibonacciTest(int input, int expected) {
        this.input = input;
        this.expected = expected;
    }

    @Test
    public void test() {
        System.out.printf("input = %d, expected = %d\n", input, expected);
        Assert.assertEquals(expected, Fibonacci.compute(input));
    }
}
