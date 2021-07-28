package pl.nullpointerexception.p2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    private static final int A = 9;
    private static final int B = 3;

    @Test
    public void sum_when9And3_then12() {
        // when
        int result = Calculator.sum(A, B);
        // then
        assertEquals(12, result);
    }

    @Test
    public void substract_when9And3_then6() {
        // when
        int result = Calculator.subtract(A, B);
        // then
        assertEquals(6, result);
    }

    @Test
    public void multiply_when9And3_then27() {
        // when
        int result = Calculator.multiply(A, B);
        // then
        assertEquals(27, result);
    }

    @Test
    public void divide_when9And3_then3() {
        // when
        float result = Calculator.divide(A, B);
        // then
        assertEquals(3, result);
    }

    static Stream<Arguments> calculatorParam() {
        return Stream.of(Arguments.arguments(2, 1, 3, 1, 2),
                Arguments.arguments(5, 0, 5, 5, 0),
                Arguments.arguments(-2, 1, -1, -3, -2),
                Arguments.arguments(0, 1, 1, -1, 0),
                Arguments.arguments(2, 2, 4, 0, 4),
                Arguments.arguments(3, -3, 0, 6, -9)
        );
    }

    @ParameterizedTest
    @MethodSource("calculatorParam")
    public void calculator(int a, int b, int sum, int subtract, int multiply) {

        int sumResult = Calculator.sum(a, b);
        int subtractResult = Calculator.subtract(a, b);
        int multiplyResult = Calculator.multiply(a, b);

        assertEquals(sum, sumResult);
        assertEquals(subtract, subtractResult);
        assertEquals(multiply, multiplyResult);
    }
}