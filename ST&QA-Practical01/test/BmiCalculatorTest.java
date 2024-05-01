import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class BmiCalculatorTest {

    @Test
    @DisplayName("Test BmiCalculator constructor")
    void testBmiCalculatorConstructor() {
        BmiCalculator bmiCalculator = new BmiCalculator(70, 170);
        assertEquals(70, bmiCalculator.weight());
        assertEquals(170, bmiCalculator.height());
    }

    @Test
    @DisplayName("Test weight and height accessor methods")
    void testAccessorMethods() {
        BmiCalculator bmiCalculator = new BmiCalculator(80, 180);
        assertEquals(80, bmiCalculator.weight());
        assertEquals(180, bmiCalculator.height());
    }

    @ParameterizedTest
    @CsvSource({
            "60, 160, 23.4, Normal",
            "80, 175, 26.1, Overweight",
            "50, 170, 17.3, Underweight",
            "90, 185, 26.3, Overweight",
            "100, 190, 27.7, Overweight",
            "75, 155, 31.2, Obese"
    })
    @DisplayName("Test calculateBMI method")
    void testCalculateBMI(double weight, double height, double expectedBmi, String expectedRange) {
        BmiCalculator bmiCalculator = new BmiCalculator(weight, height);
        String bmiInfo = bmiCalculator.calculateBMI();
        assertTrue(bmiInfo.contains(Double.toString(expectedBmi)));
        assertTrue(bmiInfo.contains(expectedRange));
    }
}
