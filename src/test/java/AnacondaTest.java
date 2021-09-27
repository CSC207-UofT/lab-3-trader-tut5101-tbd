/*
 * This file contains sample JUnit test cases for Anaconda.java
 * You should NOT modify this file!
 */
import org.junit.*;

import static org.junit.Assert.*;

public class AnacondaTest {
    Anaconda a;

    @Before
    public void setUp() throws Exception {
        a = new Anaconda();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("purrrrrr", a.sound());
    }

}
