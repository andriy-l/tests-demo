package testcases;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * A test case defines the fixture to run multiple tests. Some of the important methods of TestCase class are as follows −

int countTestCases()
Counts the number of test cases executed by run(TestResult result).

TestResult createResult()
Creates a default TestResult object.

String getName()
Gets the name of a TestCase.

TestResult run()
A convenience method to run this test, collecting the results with a default TestResult object.

void run(TestResult result)
Runs the test case and collects the results in TestResult.

void setName(String name)
Sets the name of a TestCase.

void setUp()
Sets up the fixture, for example, open a network connection.

void tearDown()
Tears down the fixture, for example, close a network connection.

String toString()
Returns a string representation of the test case.
 */
public class TestJunit2 extends TestCase  {
    protected double fValue1;
    protected double fValue2;

    @Before
    public void setUp() {
        fValue1 = 2.0;
        fValue2 = 3.0;
    }

    @Test
    public void testAdd() {
        //count the number of test cases
        System.out.println("No of Test Case = "+ this.countTestCases());

        //test getName
        String name = this.getName();
        System.out.println("Test Case Name = "+ name);

        //test setName
        this.setName("testNewAdd");
        String newName = this.getName();
        System.out.println("Updated Test Case Name = "+ newName);
    }

    //tearDown used to close the connection or clean up activities
    public void tearDown(  ) {
    }
}
