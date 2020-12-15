package hbcu.stay.ready.baronsfarm.classes;

import hbcu.stay.ready.baronsfarm.interfaces.Edible;

public class Baroness extends Pilot{

    private static Baroness instance =null;

    private Baroness(String name, String noise, long id) {
        super(name, noise, id);
    }
    public static Baroness getInstance(){
        return instance;
    }

    public static String baronessFertilizeMonday() {
        return "It is Monday let me fly and fertilize the cropRows!";
    }

    public static int baronessEatCorn() {
        int harvestedCorn = 14;
        int baronessConsumeCorn = 0;
        while(harvestedCorn != baronessConsumeCorn ){
            baronessConsumeCorn += harvestedCorn * 7;
        }
        return baronessConsumeCorn;
    }

    public static int baronessEatEggs(){
        int collectedEggs = 14;
        int baronessConsumeEggs = 0;
        while(collectedEggs != baronessConsumeEggs){
            baronessConsumeEggs += collectedEggs *7;
        }
        return baronessConsumeEggs;
    }

    public static int baronessEatTomatoes(){
        int harvestedTomatoes = 7;
        int baronessConsumeTomatoes = 0;
        while(harvestedTomatoes != baronessConsumeTomatoes){
            baronessConsumeTomatoes += harvestedTomatoes * 7;
        }
        return baronessConsumeTomatoes;
    }

    public  static int baronessRideEachHorse(){
        int totalHorseRide = 70;
        int baronessRide = 0;
        while(totalHorseRide != baronessRide){
            baronessRide += totalHorseRide * 7;
        }
        return baronessRide;
    }

    public static int baronessFeedHorse(){
        int totalHorseFeedByBaron =  210;
        int baronessFeedHorse = 0;
        while(totalHorseFeedByBaron != baronessFeedHorse){
            baronessFeedHorse += totalHorseFeedByBaron * 7;
        }
        return baronessFeedHorse;
    }


}
