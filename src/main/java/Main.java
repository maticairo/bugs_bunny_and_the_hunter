package main.java;

import main.java.exceptions.AnimalException;
import main.java.exceptions.InvalidAnimalException;
import main.java.models.*;
import main.java.models.animals.animalTypes.Animal;
import main.java.models.animals.Bear;
import main.java.models.guns.Calibre;
import main.java.models.guns.Crossbow;
import main.java.models.guns.Gun;
import main.java.models.guns.RemingtonRifle;

public class Main {
    public static void main(String[] args) throws AnimalException, InvalidAnimalException {
        Hunter elmer = new Hunter();
        Animal bear = new Bear(18, 900, 240);
        Gun rifle = new RemingtonRifle(Calibre.CALIBRE_45, 750);

        elmer.shoot(bear, rifle);

        Gun crossbow = new Crossbow();
        elmer.shoot(bear, crossbow);

        System.out.println(bear.isAlive()? "Run Yogui!":"Oh no, poor Yogui :(");
    }
}