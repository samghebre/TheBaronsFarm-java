package hbcu.stay.ready.baronsfarm;

import hbcu.stay.ready.baronsfarm.abstracts.Produce;
import hbcu.stay.ready.baronsfarm.classes.Crop;
import hbcu.stay.ready.baronsfarm.classes.Edible;
import hbcu.stay.ready.baronsfarm.classes.Tomato;
import hbcu.stay.ready.baronsfarm.classes.TomatoPlant;
import org.junit.Assert;
import org.junit.Test;

public class TomatoPlantTest {



    @Test
    public void TestHasBeenFertilized(){
        Tomato tomato = new Tomato();
        TomatoPlant tomatoPlant = new TomatoPlant(tomato);
        boolean expected = true;
        boolean actual = tomatoPlant.hasBeenFertilized();

        Assert.assertFalse(actual);

    }

    @Test
    public void fertilize() {

    }

    @Test
    public void hasBeenHarvested() {
        Tomato tomato = new Tomato();
        TomatoPlant tomatoPlant = new TomatoPlant(tomato);
        boolean expected = true;
        boolean actual = tomatoPlant.hasBeenHarvested();

        Assert.assertFalse(actual);

    }
    @Test
    public void TestTomatoYield(){
        Tomato tomato = new Tomato();
        TomatoPlant tomatoPlant = new TomatoPlant(tomato);
        Edible expected = tomato;
        Edible actual = tomatoPlant.tomatoYield(tomato);

        Assert.assertEquals(expected,actual);
    }

//    @Test
//    public void eatTest(){
//    TomatoPlant tomatoPlant = new TomatoPlant();
//    Tomato expected = new Tomato();
//    Tomato actual = tomatoPlant.eat();
//
//    Assert.assertTrue(false);
//    }
//    @Test
//    public void edibleTest(){
//       TomatoPlant tomatoPlant = new TomatoPlant();
//       String expected = "Yummy Sweet corn!";
//       String actual = tomatoPlant.Edible();
//
//       Assert.assertEquals(expected, actual);
//    }
}
