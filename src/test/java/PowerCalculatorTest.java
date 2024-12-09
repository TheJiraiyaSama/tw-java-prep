import org.junit.Test;
import static org.junit.Assert.assertEquals;
import powerpackage.PowerCalculator;

public class PowerCalculatorTest {

    @Test
    public void testPowerWithBaseOneAndExponentOne() {
        assertEquals(1, PowerCalculator.calculatePower(1, 1));
    }

    @Test
    public void testPowerWithBaseTwoAndExponentOne() {
        assertEquals(2, PowerCalculator.calculatePower(2, 1));
    }

    @Test
    public void testPowerWithBaseTwoAndExponentTwo() {
        assertEquals(4, PowerCalculator.calculatePower(2, 2));
    }

    @Test
    public void testPowerWithBaseThreeAndExponentTwo() {
        assertEquals(9, PowerCalculator.calculatePower(3, 2));
    }

    @Test
    public void testPowerWithBaseTwoAndExponentZero() {
        assertEquals(1, PowerCalculator.calculatePower(2, 0));
    }

    @Test
    public void testPowerWithBaseThreeAndNegativeExponent() {
        assertEquals(0, PowerCalculator.calculatePower(3, -2)); 
    }

    @Test
    public void testPowerWithBaseTwoAndNegativeExponent() {
        assertEquals(0, PowerCalculator.calculatePower(2, -3)); 
    }

    @Test
    public void testPowerWithBaseOneAndNegativeExponent() {
        assertEquals(1, PowerCalculator.calculatePower(1, -1));  
    }
}
