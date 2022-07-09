package main.java.models.animals.animalTypes;

import main.java.exceptions.AnimalException;
import main.java.exceptions.InvalidAnimalException;

public abstract class NormalAnimal extends Animal {

    public NormalAnimal() throws InvalidAnimalException {
        super(NormalAnimal.class.getSimpleName());
    }

    public NormalAnimal(Integer age, Integer weight, Integer height) throws AnimalException, InvalidAnimalException {
        super(age, weight, height, NormalAnimal.class.getSimpleName());
    }
}
