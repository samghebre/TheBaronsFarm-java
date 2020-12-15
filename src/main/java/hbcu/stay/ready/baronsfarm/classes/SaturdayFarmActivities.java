package hbcu.stay.ready.baronsfarm.classes;

public class SaturdayFarmActivities {

    public SaturdayFarmActivities(){

    }

    public static int baronBaronessTuesdayCornConsumption(){
        int harvestedCorn = 3;
        int tuesdayCornConsumed = 0;
        while(harvestedCorn != tuesdayCornConsumed){
            tuesdayCornConsumed += harvestedCorn;
        }
        return tuesdayCornConsumed;
    }

    public static int baronBaronessTuesdayTomatoesConsumption(){
        int harvestedTomatoes = 3;
        int tuesdayTomatoesConsumed = 0;
        while(harvestedTomatoes != tuesdayTomatoesConsumed){
            tuesdayTomatoesConsumed += harvestedTomatoes;
        }
        return tuesdayTomatoesConsumed;
    }

    public static int baronBaronessTuesdayEggsConsumption(){
        int collectedEggs = 7;
        int mondayEggsConsumed = 0;
        while(collectedEggs != mondayEggsConsumed){
            mondayEggsConsumed += collectedEggs;
        }
        return mondayEggsConsumed;
    }

    public static int baronBaronessTuesdayHorseRide(){
        int numHorsesToRide = 10;
        int tuesdayHorseRide = 0;
        int tuesdayTotalRide = 0;
        while(numHorsesToRide != tuesdayHorseRide){
            tuesdayHorseRide += numHorsesToRide;
            int bothRides = 2;
            tuesdayTotalRide = bothRides * tuesdayHorseRide;

        }
        return tuesdayTotalRide;
    }

    public static int baronBaronessTuesdayFeedHorses() {
        int numHorseToFeed = 10;
        int tuesdayFeedHorses = 0;
        int tuesdayTotalFeed = 0;
        while (numHorseToFeed != tuesdayFeedHorses) {
            tuesdayFeedHorses += numHorseToFeed;
            int bothFeedEarCorn = 6;
            tuesdayTotalFeed = bothFeedEarCorn * tuesdayFeedHorses;

        }
        return tuesdayTotalFeed;
    }

}
