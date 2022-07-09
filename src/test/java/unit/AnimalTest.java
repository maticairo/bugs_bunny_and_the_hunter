package test.java.unit;

import main.java.exceptions.AnimalException;
import main.java.models.animals.animalTypes.Animal;
import main.java.models.animals.Bear;
import main.java.models.animals.Dinosaur;
import main.java.models.guns.Calibre;
import main.java.models.guns.Gun;
import main.java.models.guns.RemingtonRifle;
import org.testng.annotations.Test;
import org.testng.Assert;

public class AnimalTest {

    @Test(expectedExceptions = AnimalException.class)
    public void animalCreationTestWithZeroAge() throws AnimalException {
        Animal animal = new Bear(0, 10, 10);
    }

    @Test(expectedExceptions = AnimalException.class)
    public void animalCreationTestWithZeroWeight() throws AnimalException {
        Animal animal = new Bear(10, 0, 10);
    }

    @Test(expectedExceptions = AnimalException.class)
    public void animalCreationTestWithZeroHeight() throws AnimalException {
        Animal animal = new Bear(10, 10, 0);
    }

    @Test(expectedExceptions = AnimalException.class)
    public void animalCreationTestWithMaxAge() throws AnimalException {
        Animal animal = new Bear(100, 10, 10);
    }

    @Test(expectedExceptions = AnimalException.class)
    public void animalCreationTestWithMaxWeight() throws AnimalException {
        Animal animal = new Bear(10, 1500, 10);
    }

    @Test(expectedExceptions = AnimalException.class)
    public void animalCreationTestWithMaxHeight() throws AnimalException {
        Animal animal = new Bear(10, 10, 300);
    }

    @Test
    public void animalAge() throws AnimalException {
        Animal animal = new Bear(10, 10, 10);
        Integer expected = 10;
        Assert.assertEquals(animal.getAge(), expected);
    }

    @Test
    public void animalWeight() throws AnimalException {
        Animal animal = new Bear(10, 10, 10);
        Integer expected = 10;
        Assert.assertEquals(animal.getWeight(), expected);
    }

    @Test
    public void animalHeight() throws AnimalException {
        Animal animal = new Bear(10, 10, 10);
        Integer expected = 10;
        Assert.assertEquals(animal.getHeight(), expected);
    }

    @Test
    public void animalWithMaxVitalSigns() throws AnimalException {
        Animal animal = new Dinosaur();
        Integer expected = 100;
        Assert.assertEquals(animal.getVitalSigns(), expected);
    }

    @Test
    public void animalWithRightVitalSigns() throws AnimalException {
        Animal animal = new Bear(10, 10, 10);
        Integer expected = 90;
        Assert.assertEquals(animal.getVitalSigns(), expected);
    }

    @Test
    public void animalAlive() throws AnimalException {
        Animal animal = new Bear(10, 10, 10);
        boolean expected = true;
        Assert.assertEquals(animal.isAlive(), expected);
    }

    @Test
    public void animalGotShot() throws AnimalException {
        Animal animal = new Bear(10, 10, 10);
        Gun gun = new RemingtonRifle(Calibre.CALIBRE_45, 100);
        animal.getShotBy(gun);
        Integer expected = 65;
        Assert.assertEquals(animal.getVitalSigns(), expected);
    }

    @Test
    public void animalIsNotAlive() throws AnimalException {
        Animal animal = new Bear(90, 10, 10);
        Gun gun = new RemingtonRifle(Calibre.CALIBRE_45, 100);
        animal.getShotBy(gun);
        boolean expected = false;
        Assert.assertEquals(animal.isAlive(), expected);
    }
}
