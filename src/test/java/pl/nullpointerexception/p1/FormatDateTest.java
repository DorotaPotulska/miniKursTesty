package pl.nullpointerexception.p1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.time.LocalDate;
import java.util.stream.Stream;

class FormatDateTest {

    @Test
    public void formatDate_formatDateYearAndMonth() {
        // given
        LocalDate localDate = LocalDate.of(2021, 3, 13);
        // when
        String result = FormatDate.formatDate(localDate);
        // then
        Assertions.assertEquals("2021-03", result);
    }

    static Stream<Arguments> localDate() {
        return Stream.of(Arguments.arguments(LocalDate.of(2021, 3, 13), "2021-03"),
                Arguments.arguments(LocalDate.of(1970, 1, 1), "1970-01"),
                Arguments.arguments(LocalDate.of(2050, 12, 31), "2050-12"),
                Arguments.arguments(LocalDate.of(2000, 6, 16), "2000-06"));
    }

    @ParameterizedTest
    @MethodSource("localDate")
    public void formatDate_givenParam_formatDateYearAndMonth(LocalDate localDate, String formatDate) {
        // when
        String result = FormatDate.formatDate(localDate);
        // then
        Assertions.assertEquals(formatDate, result);
    }
}