package TestingForStringClass;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CharAtTest {
    @Test
    @DisplayName("test charAt() with in of bound")
    public void charAt() {
        String abc = "abc";

        assertThat(abc.charAt(0)).isEqualTo('a');
        assertThat(abc.charAt(1)).isEqualTo('b');
        assertThat(abc.charAt(2)).isEqualTo('c');
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
