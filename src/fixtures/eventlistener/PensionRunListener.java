package fixtures.eventlistener;

import org.junit.runner.Description;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;

/**
 * Created by andriy on 06.03.17.
 */
public class PensionRunListener extends RunListener {
    @Override
    public void testStarted(Description description) throws Exception {
        System.out.println("test started: " + description.getMethodName());
    }
    @Override
    public void testFinished(Description description) throws Exception {
        System.out.println("test finished: " + description.getMethodName() + "\n----");
    }
    @Override
    public void testFailure(Failure failure) throws Exception {
        System.out.println("test failed with exception: " + failure.getException());
    }
    @Override
    public void testIgnored(Description description) throws Exception {
        System.out.println("test ignored: " + description.getMethodName() + "\n----");
    }
    @Override
    public void testRunFinished(Result result) throws Exception {
        System.out.println("results:");
        System.out.println("time of execution: (" + result.getRunTime()+ ") millis");
        System.out.println("was executed tests: " + result.getRunCount());
        System.out.println("tests failed: " + result.getFailureCount());
        System.out.println("tests ignored: " + result.getIgnoreCount());
        System.out.println("all tests successfully finished: " + result .wasSuccessful());
    }
}
