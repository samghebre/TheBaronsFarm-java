package hbcu.stay.ready.baronsfarm.classes;

import hbcu.stay.ready.baronsfarm.abstracts.Crop;

public class CornStalk extends Crop {

    private EarCorn earCorn = new EarCorn();
    boolean hasBeenFertilized = Crop.hasBeenFertilized;
    boolean hasBeenHarvested = Crop.hasBeenHarvested;

    public CornStalk(String cropList){
        super();
    }
    public CornStalk(){

    }

    @Override
    public Edible yield() {
        return null;
    }


    @Override
    public Edible CornYield() {
        return earCorn;
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
        this.earCorn = new EarCorn();
        return earCorn;
    }

    @Override
    public Tomato eat(Object o) {
        return null;
    }

    @Override
    public Tomato eat(edibleTomato edibleTomato) {
        return null;
    }

    @Overload
    public Tomato eat(Tomato tomato) {
        return null;
    }

    @Override
    public EarCorn eatCorn(EarCorn earCorn) {
        this.earCorn = new EarCorn();
        return earCorn;
    }

    @Override
    public void getFertilize() {

    }

    public boolean hasBeenHarvested() {
        if(hasBeenHarvested){
            return true;
        }else{
            return false;
        }
    }

    public String Edible(String corn) {
        return "Yummy Sweet corn!";
    }
}

