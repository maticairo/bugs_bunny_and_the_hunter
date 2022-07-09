package main.java.interfaces;

import main.java.models.guns.Gun;

public interface IAnimal {
    void getShotBy(Gun gun);
    boolean isAlive();

    Double getVitalSigns();
}
