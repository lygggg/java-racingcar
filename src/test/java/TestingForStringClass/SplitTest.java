package TestingForStringClass;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SplitTest {
    @Test
    @DisplayName("test split()")
    public void splitTest() {
        String testString = "1,2";
        String[] splitted = testString.split(",");

        assertThat(splitted).contains("1");
        assertThat(splitted).contains("2");
        assertThat(splitted).containsExactly("1", "2");
    }
}
