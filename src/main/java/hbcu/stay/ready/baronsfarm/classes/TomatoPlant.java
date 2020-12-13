package hbcu.stay.ready.baronsfarm.classes;

import hbcu.stay.ready.baronsfarm.abstracts.Crop;

public class TomatoPlant extends Crop {
    private Tomato tomato = new Tomato();
    boolean hasBeenFertilized = Crop.hasBeenFertilized;
    boolean hasBeenHarvested = Crop.hasBeenHarvested;
    private hbcu.stay.ready.baronsfarm.classes.edibleTomato edibleTomato;

    public TomatoPlant(String cropList){
        super();

            }
    public TomatoPlant(){

    }

    @Override
    public Edible yield() {
        return edibleTomato;
    }

    @Override
    public void harvest() {
        this.hasBeenHarvested = true;
    }

    @Override
    public void fertilize() {
        this.hasBeenFertilized = true;
    }

    public EarCorn eat() {
        return null;
    }

    @Override
    public Tomato eat(Object o) {
        return null;
    }

    @Override
    public Tomato eat(hbcu.stay.ready.baronsfarm.classes.edibleTomato edibleTomato) {
        this.tomato = new Tomato();
        return tomato;
    }

    @Override
    public Tomato eat(Tomato tomato) {
        return null;
    }

    @Overload
    public String eat(Edible edible) {
        return "Yum tomatoes!" + edible.toString();
    }

    @Override
    public EarCorn eat(EarCorn earCorn) {
        return null;
    }


    @Override
    public void getFertilize() {

    }

    public boolean isHasBeenHarvested(){
        if (hasBeenHarvested){
            return true;
        }else{
            return false;
        }
    }
}
