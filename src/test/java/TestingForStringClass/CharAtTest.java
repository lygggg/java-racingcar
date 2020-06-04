package TestingForStringClass;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CharAtTest {
    @ParameterizedTest
    @CsvSource(value = {"0:a", "1:b", "2:c"}, delimiter = ':')
    @DisplayName("test charAt() with in of bound")
    public void charAt(int input, char expected) {
        String abc = "abc";
        assertEquals(expected, abc.charAt(input));
    }

    @Test
    @DisplayName("test charAt() with out of bound")
    public void charAtException() {
        String abc = "abc";

        assertThatThrownBy(() -> {
            System.out.println(abc.charAt(3));
        })
                .isInstanceOf(IndexOutOfBoundsException.class)
                .hasMessageContaining("String index out of range: 3");
    }
}
