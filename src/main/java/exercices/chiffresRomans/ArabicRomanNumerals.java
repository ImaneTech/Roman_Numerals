package exercices.chiffresRomans;

public class ArabicRomanNumerals {
    public static String convert(int nbr) {
        String result = "";
        if (nbr == 1) {
            result = "I";
        }else if (nbr == 2) {
            result = "II";
        }else if (nbr == 3) {
            result = "III";
        }
        return result;
    }
}
