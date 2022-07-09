package main.java.models.guns;

import java.util.HashMap;
import java.util.Map;

public enum Calibre {
    CALIBRE_2,
    CALIBRE_22,
    CALIBRE_45,
    CALIBRE_100;

    private static final Map<Calibre, Double> calibreDamage = new HashMap<>()
    {
        {
            put(CALIBRE_2, 2.0);
            put(CALIBRE_22, 3.75);
            put(CALIBRE_45, 25.0);
            put(CALIBRE_100, 100.0);
        }
    };

    static Double getCalibreDamage(Calibre calibre) {
        return calibreDamage.get(calibre);
    }
}
