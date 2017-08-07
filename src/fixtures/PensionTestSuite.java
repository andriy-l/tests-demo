package fixtures;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@Suite.SuiteClasses({PensionCalculatorTest.class, PensionCalculatorSETest.class})
@RunWith(Suite.class)   // <- задає спосіб запуску тесту: тобто запуск тестів перерахованих в
// анотації Suite.SuiteClasses
public class PensionTestSuite { // чисто формально щоб був клас
}
