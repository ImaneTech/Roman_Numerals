package exercices.chiffresRomans;

public class ArabicRomanNumerals {
    public static String convert(int nbr) {
        String result = "";
        if (nbr == 1) {
            return "I";
        }else if (nbr == 2) {
            return "II";
        }
        return "";
    }
}
