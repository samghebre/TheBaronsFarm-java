package hbcu.stay.ready.baronsfarm;

import hbcu.stay.ready.baronsfarm.classes.Edible;
import hbcu.stay.ready.baronsfarm.classes.Tomato;
import hbcu.stay.ready.baronsfarm.classes.TomatoPlant;
import org.junit.Assert;
import org.junit.Test;

public class TomatoPlantTest {
    @Test
    public void tomatoYieldTest(){
        TomatoPlant tomatoPlant = new TomatoPlant();
        Tomato expected = new Tomato();
        Edible actual = tomatoPlant.yield();

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void TestHasBeenHarvested(){
        TomatoPlant tomatoPlant = new TomatoPlant();
        boolean actual = tomatoPlant.hasBeenHarvested();

        Assert.assertFalse(actual);
    }
    @Test
    public void eatTest(){
    TomatoPlant tomatoPlant = new TomatoPlant();
    Tomato expected = new Tomato();
    Tomato actual = tomatoPlant.eat();

    Assert.assertTrue(false);
    }
    @Test
    public void edibleTest(){
       TomatoPlant tomatoPlant = new TomatoPlant();
       String expected = "Yummy Sweet corn!";
       String actual = tomatoPlant.Edible();

       Assert.assertEquals(expected, actual);
    }
}
