package pl.nullpointerexception.p2;

import org.junit.jupiter.api.Test;

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
    public void multiply_when9And3_then27(){
        // when
        int result = Calculator.multiply(A, B);
        // then
        assertEquals(27,result);
    }

    @Test
    public void divide_when9And3_then3(){
        // when
        float result = Calculator.divide(A, B);
        // then
        assertEquals(3,result);
    }
}