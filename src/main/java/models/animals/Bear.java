package main.java.models.animals;

import main.java.exceptions.AnimalException;
import main.java.models.animals.animalTypes.NormalAnimal;

public class Bear extends NormalAnimal {

    public Bear() {
        super();
    }
    public Bear(Integer age, Integer weight, Integer height) throws AnimalException {
        super(age, weight, height);
    }

}
