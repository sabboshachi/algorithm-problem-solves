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
        assertEquals("String Matching Error", "AB",solve.add("A","B"));
    }
    @Test(timeout = 1000)
    public void testCaseSensitivityAdd()
    {
        assertEquals("Matching Error", "ab",solve.add("a","b"));
        assertEquals("Matching Error", "AB",solve.add("A","B"));
        assertEquals("Matching Error", "aB",solve.add("a","B"));
        assertEquals("Matching Error", "Ab",solve.add("A","b"));
    }
    @Test(timeout = 1000)
    public void testIntTypeAdd()
    {
        assertEquals("Matching Error Integer", 15,solve.add(5,10));
    }
    @Test(timeout = 1000)
    public void testFloatTypeAdd()
    {
        assertEquals("Matching Error Floating", 15.5,solve.add(5.2,10.3),.001);
    }
}
