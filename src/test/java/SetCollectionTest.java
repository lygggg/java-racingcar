import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SetCollectionTest {
    private Set<Integer> numbers;

    @BeforeEach
    void setUp() {
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
    }

    @DisplayName("Hash 사이즈 검사 테스트")
    @Test
    public void testCheckSizeTest() {
        SetCollection checkSize = new SetCollection();
        Integer result = checkSize.getNumbersSize(this.numbers);
        assertEquals(3, result);
    }

    @DisplayName("Hash안에 포함되어있는지 검사 테스트")
    @Test
    public void contains() {
        assertThat(numbers.contains(1)).isTrue();
        assertThat(numbers.contains(2)).isTrue();
        assertThat(numbers.contains(3)).isTrue();
    }

    @DisplayName("중복된 메소드 제거 테스")
    @ParameterizedTest
    @ValueSource(ints= {1, 2, 3})
    public void testContaionsTrueTes트t(int number) {
        assertTrue(numbers.contains(number));
    }

    @DisplayName("포함된 값이 없으면 false 반환하는 테스트")
    @ParameterizedTest
    @CsvSource(value= {"1:true", "2:true", "3:true", "4:false", "5:false"}, delimiter = ':')
    public void testContaionsTest(int input,boolean expected) {
        boolean result = numbers.contains(input);
        assertEquals(expected, result);
    }
    }