import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MostOccurTest {
   @Test
   public void testThatCheckTheMostOccuredNumberInTheArray(){
        int[] number = {3, 4, 3, 4, 1, 5, 3};
        int[] expectedValue = {3};
        int[] actualValue = MostOccur.most(number);
        assertArrayEquals(expectedValue, actualValue);
   }
}
