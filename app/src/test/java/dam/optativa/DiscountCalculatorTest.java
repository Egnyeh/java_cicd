package dam.optativa;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class DiscountCalculatorTest {
    @Test
    public void testStudentDiscount(){
        double result = DiscountCalculator.calculate(100.0, true);
        assertEquals(80.0, result, 0.001);
    }

    @Test
    public void testNonStudentDiscount() {
        double result = DiscountCalculator.calculate(100.0, false);
        assertEquals(95.0, result, 0.001);
    }
    
    @Test
    public void testStudentDiscountWithDifferentPrice() {
        double result = DiscountCalculator.calculate(0.0, true);
        assertEquals(0.0, result, 0.001);
    }
    
    @Test
    public void testNonStudentDiscountWithDifferentPrice() {
        double result = DiscountCalculator.calculate(-50.0, false);
        assertEquals(-50.0, result, 0.001);
    }

}
