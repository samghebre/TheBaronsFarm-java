package hbcu.stay.ready.baronsfarm.classes;

import hbcu.stay.ready.baronsfarm.abstracts.Animal;
import hbcu.stay.ready.baronsfarm.interfaces.NoiseMaker;
import hbcu.stay.ready.baronsfarm.interfaces.Rideable;

public class Horse extends Animal implements NoiseMaker, Rideable {


    public static void add(Horse horses) {
    }

    public String makeNoise(){
        return "heeehaw";
    }

    @Overload
    public String Edible(String EarCorn) {
        return "EarCorn";
    }

    @Override
    public int ride() {
        return 1;
    }

    @Override
    public String Edible() {
        return "EarCorn";
    }

    @Override
    public String eat(Edible edible) {
        return "Heehaw! yum tasty earCorn!";
    }
}
