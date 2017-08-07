package fixtures;

import org.junit.Test;
import static org.junit.Assert.*;

public class PensionCalculatorTest {

    @Test(timeout = 100)
    public void scholarshipCalculateTest() {
        IpensionCalculator pensionCalculator =
                new PensionCalculatorImpl();
        double pensionScholarship = PensionCalculatorImpl.BASIC_PENSION;
        double stepUpCoefficient = 1.1;
        double expected = pensionScholarship * stepUpCoefficient;
        double actual = pensionCalculator.pensionCalculate(pensionScholarship);
// перевірка на збіг з похибкою 0,01
        assertEquals(expected, actual, 0.01);
// Assert.assertEquals( "Test fails as: ", expected, actual, 0.01);
// deprecated :
// Assert.assertEquals(expected, actual); // на точне співпадіння — deprecated
// Assert.assertEquals( "Test fails as:", expected, actual); // deprecated
    }
}

