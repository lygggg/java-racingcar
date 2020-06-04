import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringTest {

    @DisplayName("배열의 숫자값들을트 ,을 기준으로 분리하는 테스트")
    @Test
    public void testSplitStringTest() {
        String[] arr = {"1","2"};
        StringPs splitString = new StringPs();
        String[] result1 = splitString.stringSplit("1,2");
        assertArrayEquals(arr,result1);
        String[] arr2 = {"1"};
        String[] result2 = splitString.stringSplit("1");
        assertArrayEquals(arr2,result2);
    }

    @DisplayName("()를 제거하는 테스트")
    @Test
    public void testSubStringTest() {
        String str = "1,2";
        StringPs removeString = new StringPs();
        String result = removeString.stringSub("(1,2)");
        assertEquals(str, result);
    }

    @DisplayName("문자를 가져올때 위치값을 벗어나면 메세지가 발생하는 부분에 대한 테스트")
    @Test
    public void testCharAtStringTest() {
        String str = "b";
        StringPs charAtString = new StringPs();
        String result = charAtString.stringCharAt(1,"abc");
        assertEquals(str,result);
        assertThatThrownBy(() -> {
            charAtString.stringCharAt(50,"abc");
        }).isInstanceOf(IndexOutOfBoundsException.class).hasMessageContaining("String index out of range:");
    }
    
}
