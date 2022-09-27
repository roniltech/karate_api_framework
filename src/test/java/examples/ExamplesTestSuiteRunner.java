package examples;

import com.intuit.karate.Results;
import com.intuit.karate.Runner;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

// Test Runner for specific feature files
class ExampleAPITestSuite {

    @Test
    void testSmoke() {
        Results results = Runner.path("classpath:examples/users")
                .tags("@smoke")
                .parallel(5);
        
        assertEquals(0, results.getFailCount(), results.getErrorMessages());
    }

    @Test
    void testRegression() {
        Results results = Runner.path("classpath:examples/users")
                .tags("@regression")
                .parallel(5);
        
        assertEquals(0, results.getFailCount(), results.getErrorMessages());
    }

    @Test
    void testEverything() {
        Results results = Runner.path("classpath:examples/users")
                .parallel(5);
        
        assertEquals(0, results.getFailCount(), results.getErrorMessages());        
    }
}