package calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }
    @DisplayName("계산기")
    @ParameterizedTest
    @CsvSource(value = {"2 + 3 * 4 / 2 :10","1:1", "0 * 10 * 11 + 3 :3"}, delimiter = ':')
    public void testCalculator(String input, int result) {
        assertThat(calculator.getNumber(input)).isEqualTo(result);
    }

    @DisplayName("계산기의 합을 테스트한다.")
    @Test
    public void testAddCalculator() {
        Calculator addTest = new Calculator();
        int result = addTest.addNumber("2","3");
        assertEquals(5,result);
    }

    @DisplayName("계산기의 뺄셈을 테스트한다.")
    @Test
    public void testSubtractionCalculator() {
        Calculator subTractionTest = new Calculator();
        int result = subTractionTest.subTractionNumber("4","3");
        assertEquals(1,result);
    }

    @DisplayName("계산기의 나눗셈을 테스트한다.")
    @Test
    public void testDivideCalculator() {
        Calculator divideTest = new Calculator();
        int result = divideTest.divideNumber("4","2");
        assertEquals(2,result);
    }

    @DisplayName("계산기의 셈을 테스트한다.")
    @Test
    public void testMultiplicationCalculator() {
        Calculator multiplication = new Calculator();
        int result = multiplication.multiplicationNumber("4","3");
        assertEquals(12,result);
    }

    @DisplayName("not Null")
    @Test
    public void testNotnull() {
        assertThatIllegalArgumentException().isThrownBy(() -> {
           calculator.getNumber("null");
        });
    }

    @DisplayName("not Null")
    @Test
    public void testNotContribution() {
        assertThatIllegalArgumentException().isThrownBy(() -> {
            calculator.getNumber("!");
        });
    }

}
