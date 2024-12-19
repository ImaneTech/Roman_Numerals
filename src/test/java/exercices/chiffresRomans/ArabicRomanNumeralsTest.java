package exercices.chiffresRomans;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterAll;
import static org.assertj.core.api.Assertions.assertThat;

public class ArabicRomanNumeralsTest {
    @Test
    public void return_I_for_1(){
        //GIVEN
        String expectedResult ="I";
        //WHEN
        String actualResult =ArabicRomanNumerals.convert(1);

        //THEN
        assertThat(actualResult).isEqualTo(expectedResult);

    }
}
