package main.java.models.animals.animalTypes;

import main.java.exceptions.AnimalException;
import main.java.exceptions.InvalidAnimalException;

public abstract class StrongAnimal extends Animal {

    public StrongAnimal() throws InvalidAnimalException {
        super(StrongAnimal.class.getSimpleName());
    }

    public StrongAnimal(Integer age, Integer weight, Integer height) throws AnimalException, InvalidAnimalException {
        super(age, weight, height, NormalAnimal.class.getSimpleName());
    }
}
