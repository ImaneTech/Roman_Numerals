package exercices.chiffresRomans;
import java.util.HashMap;

public class ArabicRomanNumerals {
    public static String convert(int nbr) {
        String result = "";

        while (nbr >=10){
            result += "X";
            nbr -=10;
        }
        if (nbr ==9){
            result += "IX";
            nbr -=9;
        }
         if (nbr >=5){
             result += "V";
             nbr -= 5;
         }
        if (nbr == 4){
            result += "IV";
            nbr-=4;
        }
        while(nbr >= 1){
            result += "I";
            nbr-=1;
        }
        return result;
    }
}
