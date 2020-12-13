package hbcu.stay.ready.baronsfarm.classes;

import hbcu.stay.ready.baronsfarm.abstracts.Animal;
import hbcu.stay.ready.baronsfarm.interfaces.Eater;
import hbcu.stay.ready.baronsfarm.interfaces.Produce;

public class Chicken extends Animal implements Produce, Eater {

    private EdibleEgg edibleEgg = new EdibleEgg();
    String egg = "EdibleEgg";
    boolean hasBeenFertilized = Produce.hasBeenFertilized;

    public EdibleEgg getEdibleEgg() {
        return new EdibleEgg();
    }

    public Chicken(){
        super();
    }




    @Override
    public EdibleEgg yield() {
        return edibleEgg;
    }

    @Override
   public void harvest() {

    }

    @Override
    public void fertilize() {
        this.hasBeenFertilized = true;
    }

    @Overload
    public EdibleEgg eat() {
        this.edibleEgg = new EdibleEgg();
        return edibleEgg;
    }

    @Override
    public void getFertilize() {

    }


    @Override
    public String Edible() {
        return "EdibleEgg";
    }

    @Override
    public String eat(Edible edible) {
        return "Tasty eggs!" + edible.toString();
    }

    @Overload
    public String Edible(String egg){
        return "Yummy EdibleEgg!";
    }
    public boolean hasBeenFertilized() {
        if( hasBeenFertilized){
            return true;
        }else{
            return false;
        }

    }

}
