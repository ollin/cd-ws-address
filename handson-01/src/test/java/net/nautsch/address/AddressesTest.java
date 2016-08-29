package net.nautsch.address;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.*;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

/**
 * unit test.
 */
public class AddressesTest {

    @Test
    public void shouldReturn() throws Exception {
        // given
        Addresses cut = new Addresses();
        // when
        String[] result = cut.all();
        // then
        assertThat(result, notNullValue());
    }

}
