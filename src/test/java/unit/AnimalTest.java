package test.java.unit;

import main.java.exceptions.AnimalException;
import main.java.exceptions.InvalidAnimalException;
import main.java.models.animals.animalTypes.Animal;
import main.java.models.animals.Bear;
import main.java.models.animals.Dinosaur;
import main.java.models.animals.animalTypes.StrongAnimal;
import main.java.models.guns.Bazooka;
import main.java.models.guns.Calibre;
import main.java.models.guns.Gun;
import main.java.models.guns.RemingtonRifle;
import org.testng.annotations.Test;
import org.testng.Assert;

public class AnimalTest {

    @Test(expectedExceptions = InvalidAnimalException.class)
    public void invalidAnimalCreation() throws AnimalException, InvalidAnimalException {
        class TestAnimal extends Animal {
            public TestAnimal(String animalType) throws InvalidAnimalException {
                super(animalType);
            }
        }

        Animal wrongTypeAnimal = new TestAnimal("invalidType");
    }

    @Test(expectedExceptions = AnimalException.class)
    public void animalCreationTestWithZeroAge() throws AnimalException, InvalidAnimalException {
        Animal animal = new Bear(0, 10, 10);
    }

    @Test(expectedExceptions = AnimalException.class)
    public void animalCreationTestWithZeroWeight() throws AnimalException, InvalidAnimalException {
        Animal animal = new Bear(10, 0, 10);
    }

    @Test(expectedExceptions = AnimalException.class)
    public void animalCreationTestWithZeroHeight() throws AnimalException, InvalidAnimalException {
        Animal animal = new Bear(10, 10, 0);
    }

    @Test(expectedExceptions = AnimalException.class)
    public void animalCreationTestWithMaxAge() throws AnimalException, InvalidAnimalException {
        Animal animal = new Bear(100, 10, 10);
    }

    @Test(expectedExceptions = AnimalException.class)
    public void animalCreationTestWithMaxWeight() throws AnimalException, InvalidAnimalException {
        Animal animal = new Bear(10, 1500, 10);
    }

    @Test(expectedExceptions = AnimalException.class)
    public void animalCreationTestWithMaxHeight() throws AnimalException, InvalidAnimalException {
        Animal animal = new Bear(10, 10, 300);
    }

    @Test
    public void animalAge() throws AnimalException, InvalidAnimalException {
        Animal animal = new Bear(10, 10, 10);
        Integer expected = 10;
        Assert.assertEquals(animal.getAge(), expected);
    }

    @Test
    public void animalWeight() throws AnimalException, InvalidAnimalException {
        Animal animal = new Bear(10, 10, 10);
        Integer expected = 10;
        Assert.assertEquals(animal.getWeight(), expected);
    }

    @Test
    public void animalHeight() throws AnimalException, InvalidAnimalException {
        Animal animal = new Bear(10, 10, 10);
        Integer expected = 10;
        Assert.assertEquals(animal.getHeight(), expected);
    }

    @Test
    public void animalWithMaxVitalSigns() throws AnimalException, InvalidAnimalException {
        Animal animal = new Dinosaur();
        Double expected = 100.0;
        Assert.assertEquals(animal.getVitalSigns(), expected);
    }

    @Test
    public void animalWithRightVitalSigns() throws AnimalException, InvalidAnimalException {
        Animal animal = new Bear(10, 10, 10);
        Double expected = 75.0;
        Assert.assertEquals(animal.getVitalSigns(), expected);
    }

    @Test
    public void animalAlive() throws AnimalException, InvalidAnimalException {
        Animal animal = new Bear(10, 10, 10);
        boolean expected = true;
        Assert.assertEquals(animal.isAlive(), expected);
    }

    @Test
    public void animalGotShot() throws AnimalException, InvalidAnimalException {
        Animal animal = new Bear(10, 10, 10);
        Gun gun = new RemingtonRifle(Calibre.CALIBRE_45, 100);
        animal.getShotBy(gun);
        Double expected = 50.0;
        Assert.assertEquals(animal.getVitalSigns(), expected);
    }

    @Test
    public void animalIsNotAlive() throws AnimalException, InvalidAnimalException {
        Animal animal = new Bear(50, 10, 10);
        Gun gun = new RemingtonRifle(Calibre.CALIBRE_45, 100);
        animal.getShotBy(gun);
        animal.getShotBy(gun);
        animal.getShotBy(gun);
        boolean expected = false;
        Assert.assertEquals(animal.isAlive(), expected);
    }

    @Test
    public void strongAnimalWithStrongGun() throws AnimalException, InvalidAnimalException {
        Animal animal = new Dinosaur();
        Gun gun = new Bazooka(Calibre.CALIBRE_100, 100);
        animal.getShotBy(gun);
        boolean expected = false;
        Assert.assertEquals(animal.isAlive(), expected);
    }
}
