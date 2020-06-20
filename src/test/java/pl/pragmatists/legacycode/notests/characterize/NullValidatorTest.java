package pl.pragmatists.legacycode.notests.characterize;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class NullValidatorTest {

    @Test
    public void empty_string_is_null() {
        boolean result = Validator.isNull("");

        Assertions.assertThat(result).isTrue();
    }

    @Test
    public void space_string_is_null() {
        boolean result = Validator.isNull(" ");

        Assertions.assertThat(result).isTrue();
    }

    @Test
    public void null_string_is_null() {
        boolean result = Validator.isNull("null");

        Assertions.assertThat(result).isTrue();
    }

    @Test
    public void all_spaces_string_is_null() {
        boolean result = Validator.isNull("   ");

        Assertions.assertThat(result).isTrue();
    }

    @Test
    public void null_with_spaces_string_is_null() {
        boolean result = Validator.isNull(" NULL   ");

        Assertions.assertThat(result).isFalse();
    }

    @Test
    public void long_nul_is_not_null() {
        boolean result = Validator.isNull("     ");

        Assertions.assertThat(result).isTrue();
    }
}
