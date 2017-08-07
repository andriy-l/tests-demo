package fixtures;

import java.io.File;
import java.io.IOException;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.TemporaryFolder;
import org.junit.rules.Timeout;

public class PensionCalculatorTestRule {

    private static PensionCalculatorImplSE pensionCalculator;

    @Rule
    public final TemporaryFolder folder = new TemporaryFolder();

    @Rule
    public final Timeout timeout = new Timeout(100);

    @Rule
    public final ExpectedException thrown = ExpectedException.none();

    @BeforeClass
    public static void initScholarshipCalculator() {
        pensionCalculator = new PensionCalculatorImplSE();
    }
    @Test
    public void writeResultTest() throws IOException {

        File file = folder.newFile("result.txt");
        pensionCalculator.writeResult(file);
    }
    @Test
    public void stepUpCoefficientCalculateTest() throws TooMuchChildrensException {
        thrown.expect(TooMuchChildrensException.class);
//        pensionCalculator.stepUpCoefficientCalculate(3);
        pensionCalculator.stepUpCoefficientCalculate(10);
    }
    @Test
    public void writeResultTestTwo() throws IOException {
        thrown.expect(NullPointerException.class);
        pensionCalculator.writeResult(null);
    }
}