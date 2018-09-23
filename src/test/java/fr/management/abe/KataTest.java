package fr.management.abe;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created by Adil on 23/09/2018.
 */
@RunWith(Parameterized.class)
public class KataTest {

    @Parameterized.Parameters
    public static Collection<Object[]> dataExpected() {
        return Arrays.asList(new Object[][] {
                { 1, "1" },
                { 2, "2" },
                { 3, "FooFoo" },
                { 3, "FooFoo" },
                { 5, "BarBar" },
                { 6, "Foo" },
                { 7, "Qix" },
                { 8, "8" },
                { 9, "Foo" },
                { 10, "Bar" },
                { 13, "Foo" },
                { 15, "FooBarBar" },
                { 27, "FooQix" },
                { 33, "FooFooFoo" },
                { 35, "BarFooBar" },
                { 51, "FooBar" },
                { 53, "BarFoo" },
                { 61, "61" },
                { 100, "Bar" },
        });
    }
    // object under test
    private Kata kata;

    @Before
    public void setUp() throws Exception {
        kata = new Kata();
    }

    // parameters
    private int number;
    private String expectedResult;

    public KataTest(int number, String expectedResult) {
        this.number = number;
        this.expectedResult = expectedResult;
    }

    @Test
    public void testCompute() {
        String result = kata.compute(number);
        Assert.assertTrue("failed for number " + number + ": expecting " + expectedResult + ", but was " + result,
                expectedResult.equals(result));
    }


}
