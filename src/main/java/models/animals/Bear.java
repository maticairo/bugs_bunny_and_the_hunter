package main.java.models.animals;

import main.java.exceptions.AnimalException;
import main.java.exceptions.InvalidAnimalException;
import main.java.models.animals.animalTypes.NormalAnimal;

public class Bear extends NormalAnimal {

    public Bear() throws InvalidAnimalException {
        super();
    }
    public Bear(Integer age, Integer weight, Integer height) throws AnimalException, InvalidAnimalException {
        super(age, weight, height);
    }

}
