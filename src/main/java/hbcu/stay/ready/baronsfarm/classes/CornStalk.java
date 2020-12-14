package hbcu.stay.ready.baronsfarm.classes;

public class CornStalk extends Crop<EarCorn> {

    public CornStalk(EarCorn produce) {
        super(produce);
    }
    public boolean hasBeenFertilized(){
        return false;
    }

    public boolean hasBeenHarvested(){
        return false;
    }

    public Edible cornStalkYield(EarCorn earCorn){
        boolean hasBeenFertilized = false;
        if(hasBeenFertilized && hasBeenHarvested){

        }
        return earCorn;
    }
}

