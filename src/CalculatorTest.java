import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        assertEquals("Addition test failed", 5, calculator.add(2, 3));
    }

    @Test
    public void testSubtract() {
        assertEquals("Subtraction test failed", 1, calculator.subtract(3, 2));
    }

    @Test
    public void testMultiply() {
        assertEquals("Multiplication test failed", 6, calculator.multiply(2, 3));
    }

    @Test
    public void testDivide() {
        assertEquals("Division test failed", 2.0, calculator.divide(6, 3), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        calculator.divide(6, 0);
    }
}

