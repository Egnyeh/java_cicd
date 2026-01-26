package dam.optativa;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class DiscountCalculatorTest {
    @Test
    public void testStudentDiscount(){
        double result = DiscountCalculator.calculate(100.0, true);
        assertEquals(80.0, result, 0.01, "El descuento de estudiante debe ser del 20%");
    }

    @Test
    public void testNonStudentDiscount() {
        // Test para no estudiante: 5% de descuento
        double result = DiscountCalculator.calculate(100.0, false);
        assertEquals(95.0, result, 0.01, "El descuento de no estudiante debe ser del 5%");
    }
    
    @Test
    public void testStudentDiscountWithDifferentPrice() {
        // Test con otro precio
        double result = DiscountCalculator.calculate(50.0, true);
        assertEquals(40.0, result, 0.01);
    }
    
    @Test
    public void testNonStudentDiscountWithDifferentPrice() {
        // Test con otro precio
        double result = DiscountCalculator.calculate(200.0, false);
        assertEquals(190.0, result, 0.01);
    }
}
