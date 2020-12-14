package hbcu.stay.ready.baronsfarm.classes;

public class TomatoPlant extends Crop<Tomato> {

    public TomatoPlant(Tomato produce) {
        super(produce);
    }
    public void fertilize(){
        Crop.setHasBeenFertilized(true);
    }

    public boolean hasBeenHarvested() {
        return false;
    }

}
