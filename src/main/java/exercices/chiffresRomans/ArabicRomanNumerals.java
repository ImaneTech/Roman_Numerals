package exercices.chiffresRomans;

public class ArabicRomanNumerals {
    public static String convert(int nbr) {
        String result = "";
        for (int i = 0; i < nbr; i++) {
            result += "I";
        }
        if (nbr == 4){
            result = "IV";
        }

        return result;
    }
}
