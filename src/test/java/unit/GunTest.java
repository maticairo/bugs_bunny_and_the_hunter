package test.java.unit;

import main.java.exceptions.AnimalException;
import main.java.models.guns.Calibre;
import main.java.models.guns.ColtPistol;
import main.java.models.guns.Crossbow;
import main.java.models.guns.Gun;
import org.testng.annotations.Test;
import org.testng.Assert;

public class GunTest {

    @Test
    public void gunWithMinCalibreDamage() throws AnimalException {
        Gun gun = new Crossbow();
        Double expected = 2.0;
        Assert.assertEquals(gun.getDamage(), expected);
    }

    @Test
    public void gunWithCustomCalibreDamage() throws AnimalException {
        Gun gun = new ColtPistol(Calibre.CALIBRE_22, 10);
        Double expected = 3.75;
        Assert.assertEquals(gun.getDamage(), expected);
    }

}
