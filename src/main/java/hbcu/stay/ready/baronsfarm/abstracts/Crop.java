package hbcu.stay.ready.baronsfarm.abstracts;

import hbcu.stay.ready.baronsfarm.classes.*;

import java.util.LinkedList;

public abstract class Crop<EdibleTomato> extends Field  {
    protected static boolean hasBeenFertilized;
    protected static boolean hasBeenHarvested;

    LinkedList<String>cropList;
    public Crop(){
        cropList = new LinkedList<String>();

        cropList.add(0, "CornStalk");
        cropList.add(1, "TomatoPlant");
        cropList.add(2, "SunflowerPlant");
        cropList.add(3,"AlfaAlfa");
        cropList.add(4, "Trees");
    }

    public void getHarvest() {

    }

    public abstract Edible tomatoYield();

    public abstract Edible CornYield();

    public abstract void harvest();

    public abstract void fertilize();

    public EarCorn eat() {
        return null;
    }

    public abstract Tomato eat(EdibleTomato edibleTomato);

    public abstract Tomato eat(edibleTomato edibleTomato);

    public abstract Tomato eatTomato(Tomato tomato);

    public abstract EarCorn eatCorn(EarCorn earCorn);


    public abstract void getFertilize();

    public String Edible() {
        return "";
    }
}