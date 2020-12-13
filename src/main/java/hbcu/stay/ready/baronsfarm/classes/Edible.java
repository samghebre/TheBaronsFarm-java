package hbcu.stay.ready.baronsfarm.classes;

import hbcu.stay.ready.baronsfarm.classes.EarCorn;
import hbcu.stay.ready.baronsfarm.classes.EdibleEgg;
import hbcu.stay.ready.baronsfarm.classes.Tomato;

public class Edible {
    EarCorn earCorn;
    EdibleEgg edibleEgg;
    Tomato edibleTomato;

    public Edible() {
        this.earCorn = new EarCorn();
        this.edibleEgg = new EdibleEgg();
        this.edibleTomato = new Tomato();
    }
}