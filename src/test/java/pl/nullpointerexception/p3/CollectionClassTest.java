package pl.nullpointerexception.p3;

import org.junit.jupiter.api.Test;

import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

class CollectionClassTest {

    CollectionClass testee = new CollectionClass();

    @Test
    public void getAllUsers(){
        // given
        // when
        List<User> result = testee.getAllUsers();
        // then
        assertThat(result).isNotNull();
        assertThat(result).hasSize(5);
    }

    @Test
    public void getAllActiveUsers(){
        // when
        List<User> result = testee.getAllActiveUsers();
        // then
        assertThat(result).isNotNull();
        assertThat(result).hasSize(2);
        assertThat(result).extracting("active").containsOnly(true);
    }

    @Test
    public void getAllInactiveUsers(){
        // when
        List<User> result = testee.getAllInactiveUsers();
        // then
        assertThat(result).isNotNull();
        assertThat(result).hasSize(3);
        assertThat(result).extracting("active").containsOnly(false);
        assertThat(result).extracting("name").containsExactly("jnowak","anowak","abach");
    }

}