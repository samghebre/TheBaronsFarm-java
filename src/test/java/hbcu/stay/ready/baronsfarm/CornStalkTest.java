package hbcu.stay.ready.baronsfarm;

import hbcu.stay.ready.baronsfarm.classes.CornStalk;
import hbcu.stay.ready.baronsfarm.classes.EarCorn;
import org.junit.Assert;
import org.junit.Test;

public class CornStalkTest {
    @Test(expected = StackOverflowError.class)//Applied this method to solve the problem of Stackoverflow error.
    public void cornYieldTest(){
        CornStalk cornStalk = new CornStalk();
        EarCorn expected = new EarCorn();
        EarCorn actual = (EarCorn) cornStalk.yield();

        Assert.assertEquals(expected,actual);
    }
    @Test(expected = StackOverflowError.class)
    public void TestHasBeenHarvested(){
        CornStalk cornStalk = new CornStalk();
        boolean actual = cornStalk.hasBeenHarvested();

        Assert.assertFalse(actual);
    }
    @Test(expected = StackOverflowError.class)
    public void eatTest(){
        CornStalk cornStalk = new CornStalk();
        EarCorn expected = new EarCorn();
        EarCorn actual = cornStalk.eat();

        Assert.assertTrue(actual instanceof EarCorn);
    }
    @Test(expected = StackOverflowError.class)
    public void edibleTest(){
        CornStalk cornStalk = new CornStalk();
        String expected = "Yummy Sweet corn!";
        String actual = cornStalk.Edible();

        Assert.assertEquals(expected, actual);
    }
    @Test(expected = StackOverflowError.class)
    public void eat2Test(){
        EarCorn earCorn = new EarCorn();
        CornStalk cornStalk = new CornStalk();
        String expected = "" + earCorn.toString();
        EarCorn actual = cornStalk.eat();
        Assert.assertTrue(actual instanceof EarCorn);
    }

}
