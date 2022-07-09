package main.java.models;

import main.java.models.animals.animalTypes.Animal;
import main.java.models.guns.Gun;

public class Hunter {

    public void shoot(Animal animal, Gun gun) {
        animal.getShotBy(gun);
    }
}
