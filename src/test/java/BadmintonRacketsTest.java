/*
 * This file contains sample JUnit test cases for Horse.java
 * You should NOT modify this file!
 */

import org.junit.*;

import static org.junit.Assert.*;


public class BadmintonRacketsTest {
    BadmintonRackets b;

    @Before
    public void setUp() throws Exception {
        b = new BadmintonRackets();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("What? Badminton rackets don't make sounds!", b.sound());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(250, b.getPrice());
    }

}