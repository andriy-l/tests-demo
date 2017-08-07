package fixtures;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import fixtures.PensionCalculatorImplSE;

public class PensionCalculatorSETest {

    // ініціалізація поля pensionCalculator перед кожним запуском тестового методу
    private PensionCalculatorImplSE pensionCalculator;

    @Before
    public void initPensionCalculator() {
        pensionCalculator = new PensionCalculatorImplSE();
    }

    // очищення поля      pensionCalculator після виконання кожного тестового методу
    @After
    public void clearpensionCalculator() {
        pensionCalculator = null;
    }

    @Test
    public void stepUpCoefficientForFiveTest() {
        double expected = 1.5;
        double actual = 0;
        try {
            actual = pensionCalculator.stepUpCoefficientCalculate(5);
        } catch (TooMuchChildrensException e) {
            fail(e.getMessage());
        }
        assertEquals("Coefficient for 5 is wrong:", expected, actual, 0.01);
    }

    @Test
    public void stepUpCoefficientForThreeTest() {
        double expected = 1;
        double actual = 0;
        try {
            actual = pensionCalculator.stepUpCoefficientCalculate(3);
        } catch (TooMuchChildrensException e) {
            fail(e.getMessage());
        }
        assertEquals("Coefficient for 3 is wrong:", expected, actual, 0.01);

    }

    @Test(expected = TooMuchChildrensException.class)
    public void stepUpCoefficientForTenTest() {
        int childrens = 10;  //8
        try { // якщо exception не сталось буде fail
            pensionCalculator.stepUpCoefficientCalculate(childrens);
            fail("мала бути "+ TooMuchChildrensException.class.toString());
        } catch (TooMuchChildrensException e) {
            // перевіряємо на еквівалентність тексту повідомлення про помилку
                Assert.assertEquals("You is a hero!: " + childrens, e.getMessage());
        }
    }
}

