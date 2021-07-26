package pl.nullpointerexception.p1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

class FormatDateTest {

    @Test
    public void formatDate_formatDateYearAndMonth(){
        // given
        LocalDate localDate = LocalDate.of(2021,3,13);
        // when
        String result = FormatDate.formatDate(localDate);
        // then
        Assertions.assertEquals("2021-03",result);
    }
}