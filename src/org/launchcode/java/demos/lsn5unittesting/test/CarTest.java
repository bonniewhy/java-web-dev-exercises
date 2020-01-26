package org.launchcode.java.demos.lsn5unittesting.test;

import org.junit.*;

import static org.junit.Assert.assertEquals;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.java.demos.lsn5unittesting.main.Car;

@RunWith(JUnit4.class)
public class CarTest {
    @BeforeClass
    public static void setup() {
        System.out.println("Starting unit tests CarTest!");
    }

    Car testCar;

    @Before
    public void init() {
       testCar = new Car("Toyota", "Prius", 10, 50);
    }

    //TODO: constructor sets gasTankLevel
    @Test
    public void testInitialGasTank() {
        assertEquals(10, testCar.getGasTankLevel(), .001);
    }

    //TODO: gasTankLevel is accurate after driving within tank range
    @Test
    public void testGasTankAfterDriving() {
        testCar.drive(50);
        assertEquals(9, testCar.getGasTankLevel(), .001);
    }

    //TODO: gasTankLevel is accurate after attempting to drive past tank range
    @Test
    public void testGasTankAfterExceedingTankRange() {
        testCar.drive(501);
        assertEquals(testCar.getGasTankLevel(), 0, .001);
    }

    //TODO: can't have more gas than tank size, expect an exception
    @Test(expected = IllegalArgumentException.class)
    public void testGasOverfillException() {
        testCar.addGas(5);
        Assert.fail("Shouldn't get here, car cannot have more gas in tank than the size of the tank.");
    }
}
