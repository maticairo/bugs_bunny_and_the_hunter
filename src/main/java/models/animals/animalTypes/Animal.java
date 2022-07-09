package main.java.models.animals.animalTypes;

import main.java.exceptions.AnimalException;
import main.java.exceptions.InvalidAnimalException;
import main.java.interfaces.IAnimal;
import main.java.models.guns.Gun;

public abstract class Animal implements IAnimal {

    private static final Double MAX_VITAL_SIGNS = 100.0;
    private static final Double NORMAL_VITAL_SIGNS = 75.0;
    private static final Double WEAK_VITAL_SIGNS = 7.5;
    private static final Double ULTRA_WEAK_VITAL_SIGNS = 1.0;
    private static final int MAX_AGE = 100;
    private static final int MAX_WEIGHT = 1000;
    private static final int MAX_HEIGHT = 250;

    private Double vitalSigns;
    private Integer age;
    private Integer weight;
    private Integer height;

    public Animal(String animalType) throws InvalidAnimalException {
        setVitalSigns(animalType);
    }

    public Animal(Integer age, Integer weight, Integer height, String animalType) throws AnimalException, InvalidAnimalException {

        if(age <= 0 || weight <= 0 || height <= 0) {
            throw new AnimalException("Input data for age, weight or height cannot be zero or lower");
        }

        if(age >= MAX_AGE){
            throw new AnimalException(String.format("Age cannot be greater or equals %d", MAX_AGE));
        }

        if(weight > MAX_WEIGHT){
            throw new AnimalException(String.format("Weight cannot be greater than %d", MAX_WEIGHT));
        }

        if(height > MAX_HEIGHT){
            throw new AnimalException(String.format("Height cannot be greater than %d", MAX_HEIGHT));
        }

        this.age = age;
        this.weight = weight;
        this.height = height;
        setVitalSigns(animalType);
    }

    private void setVitalSigns(String animalType) throws InvalidAnimalException {
        System.out.println(animalType);
        switch (animalType) {
            case "StrongAnimal" -> this.vitalSigns = MAX_VITAL_SIGNS;
            case "NormalAnimal" -> this.vitalSigns = NORMAL_VITAL_SIGNS;
            case "WeakAnimal" -> this.vitalSigns = WEAK_VITAL_SIGNS;
            case "UltraWeakAnimal" -> this.vitalSigns = ULTRA_WEAK_VITAL_SIGNS;
            default -> throw new InvalidAnimalException("Your animal type is invalid");
        }
    }

    public final void getShotBy(Gun gun){
        this.vitalSigns -= gun.getDamage();
    }

    public final boolean isAlive() {
        return this.vitalSigns > 0.0;
    }

    public final Double getVitalSigns() {
        return this.vitalSigns;
    }

    public final Integer getAge() {
        return age;
    }

    public final Integer getWeight() {
        return weight;
    }

     public final Integer getHeight() {
        return height;
    }
}
