package main.java.models.animals.animalTypes;

import main.java.exceptions.AnimalException;
import main.java.exceptions.InvalidAnimalException;

public abstract class UltraWeakAnimal extends Animal {

    public UltraWeakAnimal() throws InvalidAnimalException {
        super(UltraWeakAnimal.class.getSimpleName());
    }

    public UltraWeakAnimal(Integer age, Integer weight, Integer height) throws AnimalException, InvalidAnimalException {
        super(age, weight, height, NormalAnimal.class.getSimpleName());
    }
}
