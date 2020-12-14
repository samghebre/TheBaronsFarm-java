package hbcu.stay.ready.baronsfarm;

import hbcu.stay.ready.baronsfarm.classes.Baron;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class BaronTest {

    @Test
    public void TestBaronEatCorn(){
        int expected = 1;
        Baron baron = Baron.getInstance();
        int actual = Baron.baronEatCorn();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void TestBaronEatEggs(){
        int expected = 5;
        Baron baron = Baron.getInstance();
        int actual = Baron.baronEatEggs();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void TestBaronEatTomatoes(){
        int expected = 2;
        Baron baron = Baron.getInstance();
        int actual = Baron.baronEatTomatoes();

        Assert.assertEquals(expected,actual);
    }
    @Test
    public void TestBaronFeeHorse(){
        int expected = 210;
        Baron baron = Baron.getInstance();
        int actual = Baron.baronFeedHorse();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void TestBaronRideEachHorse(){
        int expected = 70;
        Baron baron = Baron.getInstance();
        int actual = Baron.baronRideEachHorse();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void TestBaronHarvestTuesday(){
        String expected = "It is Tuesday time to harvest some  and corn";
        Baron baron = Baron.getInstance();
        String actual = Baron.BaronHarvestTuesday();
    }
}