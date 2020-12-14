package hbcu.stay.ready.baronsfarm.classes;

import hbcu.stay.ready.baronsfarm.interfaces.Edible;

public class Baron extends Farmer{
    private static Baron instance = null;

    private Baron(String name, String noise, long id) {
        super(name, noise, id);


    }

    public static Baron getInstance(){
        return instance;
    }

    public static int baronEatCorn() {
        int harvestedCorn = 1;
        int consumeCorn = 0;
        while(harvestedCorn != consumeCorn ){
            consumeCorn += harvestedCorn;
            consumeCorn = consumeCorn *7;
        }
        return consumeCorn;
    }

    public static int baronEatEggs(){
        int collectedEggs = 5;
        int consumeEggs = 0;
        while(collectedEggs != consumeEggs){
            consumeEggs += collectedEggs;
            consumeEggs = consumeEggs * 7;
        }
        return consumeEggs;
    }

    public static int baronEatTomatoes(){
        int harvestedTomatoes = 2;
        int consumeTomatoes = 0;
        while(harvestedTomatoes != consumeTomatoes){
            consumeTomatoes += harvestedTomatoes;
        }
        return consumeTomatoes;
    }
    public static String BaronHarvestTuesday(){
        return "It is Tuesday time to harvest some  and corn";
    }

    public  static int baronRideEachHorse(){
        int totalHorseRide = 70;
        int baronRide = 0;
        while(totalHorseRide != baronRide){
            baronRide += totalHorseRide;
            baronRide = baronRide * 7;
        }
        return baronRide;
    }

    public static int baronFeedHorse(){
        int totalHorseFeedByBaron =  210;
        int baronFeedHorse = 0;
        while(totalHorseFeedByBaron != baronFeedHorse){
            baronFeedHorse += totalHorseFeedByBaron;
            baronFeedHorse = baronFeedHorse * 7;
        }
        return baronFeedHorse;
    }


}
