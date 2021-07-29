package pl.nullpointerexception.p4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class CollectionClassExtendedTest {


    private static final boolean ACTIVE = true;
    private static final boolean INACTIVE = false;
    CollectionClassExtended testee;

    @BeforeEach
    void setUp() {
        List<User> users = Arrays.asList(
                new User("ppotulski", ACTIVE),
                new User("dpotulska", INACTIVE),
                new User("mpotulski", ACTIVE),
                new User("apotulska", ACTIVE)
        );

        testee = new CollectionClassExtended(users);
    }

    @Test
    public void getAllUsers() {
        // given
        // when
        List<User> result = testee.getAllUsers();
        // then
        assertThat(result).isNotNull();
        assertThat(result).hasSize(4);
    }

    @Test
    public void getAllActiveUsers() {
        // when
        List<User> result = testee.getAllActiveUsers();
        // then
        assertThat(result).isNotNull();
        assertThat(result).hasSize(3);
        assertThat(result).extracting("active").containsOnly(true);
    }

    @Test
    public void getAllInactiveUsers() {
        // when
        List<User> result = testee.getAllInactiveUsers();
        // then
        assertThat(result).isNotNull();
        assertThat(result).hasSize(1);
        assertThat(result).extracting("active").containsOnly(false);
        assertThat(result).extracting("name").containsExactly("dpotulska");
    }

}