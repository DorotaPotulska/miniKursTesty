package pl.nullpointerexception.p7;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class EmptyStringTest {

    @ParameterizedTest(name = "Param: `{0}`")
    @ValueSource(strings = {" ", "  ", "a", " a ", "    aaa   "})
    void shouldCheckStringIfNotEmpty(String s) {
        //when
        boolean result = EmptyString.checkIfNotEmpty(s);
        //then
        assertThat(result).isTrue();


    }
}