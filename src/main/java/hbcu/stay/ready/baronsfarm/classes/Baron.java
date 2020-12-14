package hbcu.stay.ready.baronsfarm.classes;

import hbcu.stay.ready.baronsfarm.interfaces.Edible;

public class Baron extends Farmer{
    private static Baron instance;
    private Baron(String name, String noise, long id) {
        super(name, noise, id);


    }

    public Baron getInstance(){
        return instance;
    }

    public String eatBaron(Edible edible) {
        return "Good food!";
    }

}
