package fixtures.eventlistener;

import java.io.File;
import java.io.IOException;

import fixtures.PensionCalculatorImplSE;
import fixtures.TooMuchChildrensException;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.TemporaryFolder;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

@RunWith(PensionRunner.class)
public class PensionCalculatorTestRule {
    private static PensionCalculatorImplSE pensionCalculator;
    @BeforeClass
    public static void initScholarshipCalculator() {
        pensionCalculator = new PensionCalculatorImplSE();
    }
    @Rule
    public final TemporaryFolder folder = new TemporaryFolder();
    @Rule
    public final Timeout timeout = new Timeout(300);
    @Rule
    public final ExpectedException thrown = ExpectedException.none();
    @Test
    public void writeResultTest() throws IOException {
        File file = folder.newFile("/tmp/result.txt"); // test will fail
        pensionCalculator.writeResult(file);
    }
    @Test
    public void stepUpCoefficientCalculateTest() throws TooMuchChildrensException {
        thrown.expect(TooMuchChildrensException.class);
        pensionCalculator.stepUpCoefficientCalculate(11);
    }
    @Ignore("this test is not ready yet")
    @Test
    public void writeResultTestTwo() throws IOException {
        thrown.expect(NullPointerException.class);
        pensionCalculator.writeResult(null);
    }
}
