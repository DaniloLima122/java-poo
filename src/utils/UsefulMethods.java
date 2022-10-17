package utils;

import java.text.Normalizer;
import java.util.regex.Pattern;

public class UsefulMethods {

    public static boolean compareCargos(String cargoA, String cargoB){
        return cargoA.compareToIgnoreCase(cargoB) == 0;
    }

    public static String normalizeString(String source) {
        return Normalizer.normalize(source, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
    }
}
