package lesson3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PolyndromeTest {
    public PolyndromeTest(){

    }

    @Test
    @DisplayName("Valid scenario")
    void polyndromeValidTest() throws TooShortLenghtOfWordException{
        Assertions.assertTrue(IsPolyndrome.checkPolyndrome("tenet"));
    }

    @Test
    @DisplayName("Exception scenario")
    void polyndromeExceptionTest() throws TooShortLenghtOfWordException {
        Assertions.assertThrows(TooShortLenghtOfWordException.class,() -> IsPolyndrome.checkPolyndrome("t"));
    }
    //так как ввести ноль символов невозможно для запуска то исключение пробрасывается только при одном символе
}
