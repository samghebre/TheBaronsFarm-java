package hbcu.stay.ready.baronsfarm.classes;

import hbcu.stay.ready.baronsfarm.abstracts.Produce;

public class Tomato extends Produce {
    public Tomato(){
        super();
    }

    public Tomato(Edible edible) {
        super(edible);
    }

    @Override
    public Edible getProduce() {
        return getProduce().yield();
    }
}
