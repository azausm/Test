import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseStringTest {
    @Test
    public void reverseTestWithNull(){
        Assertions.assertNull(ReverseString.reverseString(null));
    }

    @Test
    public void reverseStringDigit(){
        Assertions.assertEquals("cba321", ReverseString.reverseString("123abc"));
    }
    @Test
    public void reverseString(){
        Assertions.assertEquals("elppa", ReverseString.reverseString("apple"));
}

}
