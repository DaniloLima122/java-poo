package utils;

import java.text.Normalizer;

public class UsefulMethods {

    public static boolean compareString(String cargoA, String cargoB){
        return cargoA.compareToIgnoreCase(cargoB) == 0;
    }

    public static String normalizeString(String source) {
        return Normalizer.normalize(source, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
    }

    public static String capitalize(String str)
    {
        if (str == null || str.length() == 0) return str;
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
}
