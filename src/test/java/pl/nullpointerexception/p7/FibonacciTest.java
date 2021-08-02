package pl.nullpointerexception.p7;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class FibonacciTest {

    @ParameterizedTest
    @MethodSource("fibonacciParams")
    void fibonacci(int n, int expected) {
        //when
        int result = Fibonacci.fibonacci(n);
        //then
        assertThat(result).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({"0,0",
            "1,1",
            "2,1",
            "3,2",
            "4,3",
            "5,5",
            "6,8",
            "7,13"
    })
    void fibonacciV2(int n, int expected) {
        //when
        int result = Fibonacci.fibonacci(n);
        //then
        assertThat(result).isEqualTo(expected);
    }

    static Stream<Arguments> fibonacciParams() {
        return Stream.of(
                Arguments.arguments(0, 0),
                Arguments.arguments(1, 1),
                Arguments.arguments(2, 1),
                Arguments.arguments(3, 2),
                Arguments.arguments(4, 3),
                Arguments.arguments(5, 5),
                Arguments.arguments(6, 8),
                Arguments.arguments(7, 13),
                Arguments.arguments(8, 21),
                Arguments.arguments(9, 34),
                Arguments.arguments(10, 55)
        );
    }
}