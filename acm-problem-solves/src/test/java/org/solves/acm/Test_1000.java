package org.solves.acm;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class Test_1000 {
    private Solve_1000 solve;

    @Before
    public void init(){
        solve = new Solve_1000();
    }
    @Test(timeout = 1000)
    public void testSimpleAdd()
    {
        assertEquals("Matched Expected", "AB",solve.add("A","B"));
    }
    @Test(timeout = 1000)
    public void testCaseSensitivityAdd()
    {
        assertEquals("Matched Expected", "ab",solve.add("a","b"));
        assertEquals("Matched Expected", "AB",solve.add("A","B"));
        assertEquals("Matched Expected", "aB",solve.add("a","B"));
        assertEquals("Matched Expected", "Ab",solve.add("A","b"));
    }
}
