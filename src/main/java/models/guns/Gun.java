package main.java.models.guns;

import main.java.interfaces.IGun;

public abstract class Gun implements IGun {

    private static final Calibre MIN_CALIBRE = Calibre.CALIBRE_2;
    private final Calibre calibre;
    private Integer model;

    public Gun() {
        this.calibre = MIN_CALIBRE;
    }

    public Gun(Calibre calibre, Integer model) {
        this.calibre = calibre;
        this.model = model;
    }

    @Override
    public final Double getDamage() {
        return Calibre.getCalibreDamage(this.calibre);
    }
}
