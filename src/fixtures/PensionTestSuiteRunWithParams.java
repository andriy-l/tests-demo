package fixtures;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class PensionTestSuiteRunWithParams { // чисто формально щоб був клас
    // оголошення параметрів як полів
     private int childrens;
     private double stepUpCoefficient;
     // public-конструктор з параметрами для ініціалізації полів

    public PensionTestSuiteRunWithParams(int childrens, double stepUpCoefficient) {
        this.childrens = childrens;
        this.stepUpCoefficient = stepUpCoefficient;
    }
    // визначення набору параметрів як колекції
    @Parameters public static Collection<Object[]> stepUpCoefficientTableValues() {
        return Arrays.asList(new Object[][] {
                { 3, 1.0 },
                { 4, 1.3 },
                { 5, 1.5 }
        });
    }
    @Test
    public void stepUpCoefficientTest() throws TooMuchChildrensException {
        PensionCalculatorImplSE pensionCalculatorImplSE = new PensionCalculatorImplSE();
        double expected = this.stepUpCoefficient;
        double actual = pensionCalculatorImplSE.stepUpCoefficientCalculate(this.childrens);
        assertEquals(expected, actual, 0.01);
    }
}
