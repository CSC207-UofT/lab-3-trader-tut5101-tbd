import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

public class CarTest {
    Car c;



    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(0, c.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        c.upgradeSpeed();
        assertEquals(1, c.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(50, c.getPrice());
    }

    //I forgot a test case

    @Before
    public void setUp() throws Exception {
        c = new Car();
    }
}