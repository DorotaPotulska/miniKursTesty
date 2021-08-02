package pl.nullpointerexception.p6;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;
import static pl.nullpointerexception.p6.ExceptionsExample.DEFAULT_NUMBER;

class ExceptionsExampleTest {

    private ExceptionsExample testee = new ExceptionsExample();

    @Test
    void shouldReturnStringFromNumberIfNumberIsLessThanDefault() {
        //given
        int i = 2;
        //when
        String result = testee.doSomething(i);
        //then
        assertThat(result).isEqualTo("2");
    }

    @Test
    void shouldReturnStringFromNumberIfNumberIsEqualDefault() {
        //when
        String result = testee.doSomething(DEFAULT_NUMBER);
        //then
        assertThat(result).isEqualTo(String.valueOf(DEFAULT_NUMBER));
    }

    @Test
    void shouldThrowExceptionIfNumberIsGreaterThanDefault() {
        //given
        int i = 10;
        //when
        //junit5
        assertThrows(IllegalArgumentException.class,
                () -> testee.doSomething(i),
                "Parametr jest większy od 5");
        //assertJ
        assertThatThrownBy(() -> testee.doSomething(i))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Parametr jest większy od 5");
    }

    @Test
    void shouldThrowExceptionIfNumberIsGreaterThanDefault_oldVersion() {
        //given
        int i= 10;
        //when
        try {
            testee.doSomething(i);
            fail();
        }catch(IllegalArgumentException e){
            assertThat(e).isInstanceOf(IllegalArgumentException.class)
                    .hasMessage("Parametr jest większy od 5");
        }
    }
}