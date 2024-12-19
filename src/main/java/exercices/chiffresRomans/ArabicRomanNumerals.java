package exercices.chiffresRomans;

public class ArabicRomanNumerals {
    public static String convert(int nbr) {
        String result = "";
        if (nbr >=10){
            result = "X";
            nbr -=10;
        }
         if (nbr >=5){
             result += "V";
             nbr -= 5;
         }
        for (int i = 0; i < nbr; i++) {
            result += "I";
        }
        if (nbr == 4){
            result = "IV";
        }
        return result;
    }
}
