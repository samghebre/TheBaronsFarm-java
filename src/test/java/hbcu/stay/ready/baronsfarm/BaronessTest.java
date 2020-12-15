package hbcu.stay.ready.baronsfarm;

import hbcu.stay.ready.baronsfarm.classes.Baroness;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class BaronessTest {

    @Test

    public void TestBaronessEatCorn(){
        int expected = 14;
        Baroness baroness = Baroness.getInstance();
        int actual = Baroness.baronessEatCorn();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void TestBaronessEatEggs(){
        int expected = 14;
        Baroness baroness = Baroness.getInstance();
        int actual = Baroness.baronessEatEggs();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void TestBaronessEatTomatoes(){
        int expected = 7;
        Baroness baroness = Baroness.getInstance();
        int actual = Baroness.baronessEatTomatoes();

        Assert.assertEquals(expected,actual);
    }
    @Test
    public void TestBaronessFeeHorse(){
        int expected = 210;
        Baroness baroness = Baroness.getInstance();
        int actual = Baroness.baronessFeedHorse();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void TestBaronessRideEachHorse(){
        int expected = 70;
        Baroness baroness = Baroness.getInstance();
        int actual = Baroness.baronessRideEachHorse();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void TestBaronessFertilizeMonday(){
        String expected = "It is Monday let me fly and fertilize the cropRows!";
        Baroness baroness = Baroness.getInstance();
        String actual = Baroness.baronessFertilizeMonday();

        Assert.assertEquals(expected,actual);
    }

}
