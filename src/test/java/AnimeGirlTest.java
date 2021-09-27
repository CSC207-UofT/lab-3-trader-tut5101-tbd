import org.junit.*;

import static org.junit.Assert.assertEquals;

public class AnimeGirlTest {
    AnimeGirl a;
    @Before
    public void setUp() throws Exception {
        a = new AnimeGirl();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("Biubiubiu", a.sound());
    }
    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(80, a.getPrice());
    }
}
