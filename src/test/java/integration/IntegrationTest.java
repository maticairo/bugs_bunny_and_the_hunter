package test.java.integration;

import main.java.exceptions.InvalidAnimalException;
import main.java.models.Hunter;
import main.java.models.animals.animalTypes.Animal;
import main.java.models.animals.Bear;
import main.java.models.animals.BugsBunny;
import main.java.models.animals.Deer;
import main.java.models.guns.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IntegrationTest {

    @Test
    public void deerHuntingWithRifleTest() throws InvalidAnimalException {
        Hunter hunter = new Hunter();
        Gun gun = new RemingtonRifle(Calibre.CALIBRE_45, 750);
        Animal deer = new Deer();

        hunter.shoot(deer, gun);

        Assert.assertFalse(deer.isAlive());
    }

    @Test
    public void deerHuntingWithColtFailedTest() throws InvalidAnimalException {
        Hunter hunter = new Hunter();
        Gun gun = new ColtPistol(Calibre.CALIBRE_22, 10);
        Animal deer = new Deer();

        hunter.shoot(deer, gun);

        Assert.assertTrue(deer.isAlive());
    }

    @Test
    public void deerHuntingWithColtSuccessTest() throws InvalidAnimalException {
        Hunter hunter = new Hunter();
        Gun gun = new ColtPistol(Calibre.CALIBRE_22, 10);
        Animal deer = new Deer();

        hunter.shoot(deer, gun);
        hunter.shoot(deer, gun);

        Assert.assertFalse(deer.isAlive());
    }

    @Test
    public void bearHuntingWithRifleFailedTest() {
        Hunter hunter = new Hunter();
        Gun gun = new RemingtonRifle(Calibre.CALIBRE_45, 750);
        Animal bear = new Bear();

        hunter.shoot(bear, gun);
        hunter.shoot(bear, gun);

        Assert.assertTrue(bear.isAlive());
    }

    @Test
    public void bearHuntingWithRifleSuccessTest() {
        Hunter hunter = new Hunter();
        Gun gun = new RemingtonRifle(Calibre.CALIBRE_45, 750);
        Animal bear = new Bear();

        hunter.shoot(bear, gun);
        hunter.shoot(bear, gun);
        hunter.shoot(bear, gun);

        Assert.assertFalse(bear.isAlive());
    }

    @Test
    public void bearHuntingWithColtFailedTest() {
        Hunter hunter = new Hunter();
        Gun gun = new ColtPistol(Calibre.CALIBRE_22, 10);
        Animal bear = new Bear();

        hunter.shoot(bear, gun);

        Assert.assertTrue(bear.isAlive());
    }

    @Test
    public void bearHuntingWithColtSuccessTest() {
        Hunter hunter = new Hunter();
        Gun gun = new ColtPistol(Calibre.CALIBRE_22, 10);
        Animal bear = new Bear();

        for(int i = 0; i < 25; i++) {
            hunter.shoot(bear, gun);
        }

        Assert.assertFalse(bear.isAlive());
    }

    @Test
    public void bugsBunnyHuntinWithCrossbow() throws InvalidAnimalException {
        Hunter hunter = new Hunter();
        Gun gun = new Crossbow();
        Animal bear = new BugsBunny();

        hunter.shoot(bear, gun);

        Assert.assertFalse(bear.isAlive());
    }
}
