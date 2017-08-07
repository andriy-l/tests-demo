package fixtures.eventlistener;

import org.junit.runner.notification.RunNotifier;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.InitializationError;

/**
 * Created by andriy on 06.03.17.
 */
public class PensionRunner extends BlockJUnit4ClassRunner {
        private PensionRunListener runListener;
        public PensionRunner(Class<PensionRunListener> clazz)
                throws InitializationError {
            super(clazz);
            runListener = new PensionRunListener();
        }
        public void run(RunNotifier notifier) {
            notifier.addListener(runListener);
            super.run(notifier);
        }

}
