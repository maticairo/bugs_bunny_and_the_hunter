package main.java.models.animals.animalTypes;

import main.java.exceptions.AnimalException;
import main.java.exceptions.InvalidAnimalException;

public abstract class WeakAnimal extends Animal {

    public WeakAnimal() throws InvalidAnimalException {
        super(WeakAnimal.class.getSimpleName());
    }

    public WeakAnimal(Integer age, Integer weight, Integer height) throws AnimalException, InvalidAnimalException {
        super(age, weight, height, NormalAnimal.class.getSimpleName());
    }
}
