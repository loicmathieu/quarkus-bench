package fr.loicmathieu.quickperf;

import org.junit.jupiter.api.Test;
import org.quickperf.junit5.QuickPerfTest;
import org.quickperf.jvm.allocation.AllocationUnit;
import org.quickperf.jvm.annotations.ExpectMaxHeapAllocation;
import org.quickperf.jvm.annotations.ExpectMaxRSS;
import org.quickperf.jvm.annotations.HeapSize;
import org.quickperf.jvm.annotations.JvmOptions;
import org.quickperf.jvm.annotations.MeasureHeapAllocation;
import org.quickperf.jvm.annotations.MeasureRSS;
import org.testcontainers.junit.jupiter.Testcontainers;

@QuickPerfTest
@Testcontainers
public class ExampleResourceTest {

    @Test
    @JvmOptions("-Djava.util.logging.manager=org.jboss.logmanager.LogManager")
    @HeapSize(value = 64, unit = AllocationUnit.MEGA_BYTE) // define a heap size of 32m
    @ExpectMaxHeapAllocation(value = 475, unit = AllocationUnit.MEGA_BYTE) // check total allocation inside the heap
    @MeasureHeapAllocation
    @ExpectMaxRSS(value = 325, unit = AllocationUnit.MEGA_BYTE) // check RSS size (keep in mind it includes JUnit overhead)
    @MeasureRSS
    public void testJavaMain() {
        // this will starts Quarkus and ends it immediately
        // we don't do any REST call so Quarkus is only bootstrapped, the application is not really started
        // maybe doing a call inside the main method will do the trick
        JavaMain.main();
    }

}