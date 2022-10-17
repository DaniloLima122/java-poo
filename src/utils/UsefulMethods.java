package utils;

import java.text.Normalizer;

public class UsefulMethods {

    public static boolean compareString(String cargoA, String cargoB){
        return cargoA.compareToIgnoreCase(cargoB) == 0;
    }

    public static String normalizeString(String source) {
        return Normalizer.normalize(source, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
    }
}
