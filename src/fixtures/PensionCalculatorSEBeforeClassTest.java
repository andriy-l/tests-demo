package fixtures;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PensionCalculatorSEBeforeClassTest {

    // ініціалізація поля pensionCalculator перед кожним запуском тестового методу
    private static PensionCalculatorImplSE pensionCalculator;

    @BeforeClass
    public static void initPensionCalculator() { // must be static method
        pensionCalculator = new PensionCalculatorImplSE();
    }

    @Test
    public void stepUpCoefficientForFiveTest() throws TooMuchChildrensException {
        double expected = 1.5;
        double actual = pensionCalculator.stepUpCoefficientCalculate(5);
        assertEquals("Coefficient for 5 is wrong:", expected, actual, 0.01);
    }

    @Test
    public void stepUpCoefficientForThreeTest() throws TooMuchChildrensException {
        double expected = 1;
        double actual = pensionCalculator.stepUpCoefficientCalculate(3);
        assertEquals("Coefficient for 3 is wrong:", expected, actual, 0.01);
    }
}

