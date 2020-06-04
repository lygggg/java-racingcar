package TestingForStringClass;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SubstringTest {
    @Test
    @DisplayName("test substring()")
    public void substringTest() {
        String testString ="(1,2)";
        String testSubString = testString.substring(1, 4);

        assertThat(testSubString).isEqualTo("1,2");
    }
}
