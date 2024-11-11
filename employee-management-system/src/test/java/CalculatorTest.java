import static org.junit.Assert.*;
import org.junit.*;

import com.javainuse.main.Calculator;

public class CalculatorTest {

    private static Calculator calculator; // Declare a shared Calculator instance

    @BeforeClass
    public static void setUpClass() {
        System.out.println("Initializing resources before any tests are run...");
        calculator = new Calculator(); // Initialize calculator once for all tests
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("Cleaning up resources after all tests have run...");
        calculator = null; // Clean up shared resources
    }

    @Before
    public void setUp() {
        System.out.println("Setting up before each test...");
        // Additional setup can be done here if needed
    }

    @After
    public void tearDown() {
        System.out.println("Tearing down after each test...");
        // Additional cleanup can be done here if needed
    }

    @Test
    public void testAdd() {
        System.out.println("Running testAdd...");
        assertEquals("Addition test failed", 5, calculator.add(2, 3));
    }

    @Test
    public void testSubtract() {
        System.out.println("Running testSubtract...");
        assertEquals("Subtraction test failed", 1, calculator.subtract(3, 2));
    }

    @Test
    public void testMultiply() {
        System.out.println("Running testMultiply...");
        assertEquals("Multiplication test failed", 6, calculator.multiply(2, 3));
    }

    @Test
    public void testDivide() {
        System.out.println("Running testDivide...");
        assertEquals("Division test failed", 2.0, calculator.divide(6, 3), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        System.out.println("Running testDivideByZero...");
        calculator.divide(6, 0);
    }
}
