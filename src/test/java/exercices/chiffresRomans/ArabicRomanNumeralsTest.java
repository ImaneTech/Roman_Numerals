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

    @Test
    public void return_II_for_2(){
        //GIVEN
        String expectedResult ="II";
        //WHEN
        String actualResult =ArabicRomanNumerals.convert(2);

        //THEN
        assertThat(actualResult).isEqualTo(expectedResult);

    }

    @Test
    public void return_III_for_3(){
        //GIVEN
        String expectedResult ="III";
        //WHEN
        String actualResult =ArabicRomanNumerals.convert(3);

        //THEN
        assertThat(actualResult).isEqualTo(expectedResult);

    }
    @Test
    public void return_IV_for_4(){
        //GIVEN
        String expectedResult ="IV";
        //WHEN
        String actualResult =ArabicRomanNumerals.convert(4);

        //THEN
        assertThat(actualResult).isEqualTo(expectedResult);

    }
    @Test
    public void return_X_for_10(){
        //GIVEN
        String expectedResult ="X";
        //WHEN
        String actualResult =ArabicRomanNumerals.convert(10);

        //THEN
        assertThat(actualResult).isEqualTo(expectedResult);

    }
    @Test
    public void return_XIII_for_13(){
        //GIVEN
        String expectedResult ="XIII";
        //WHEN
        String actualResult =ArabicRomanNumerals.convert(13);

        //THEN
        assertThat(actualResult).isEqualTo(expectedResult);

    }
    @Test
    public void return_XXXIX_for_39(){
        //GIVEN
        String expectedResult ="XXXIX";
        //WHEN
        String actualResult =ArabicRomanNumerals.convert(39);

        //THEN
        assertThat(actualResult).isEqualTo(expectedResult);

    }

}





