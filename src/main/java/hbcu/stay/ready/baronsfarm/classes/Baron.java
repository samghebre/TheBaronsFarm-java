package hbcu.stay.ready.baronsfarm.classes;

import hbcu.stay.ready.baronsfarm.abstracts.Crop;

public class Baron extends Farmer{
    private static Baron instance;
    private Baron(String name, String noise, long id) {
        super(name, noise, id);


    }

    public Baron getInstance(){
        return instance;
    }

    @Override
    public String eat(Edible edible) {
        return super.eat(edible);
    }
    public CropDuster ride(CropDuster cropDuster){
        return cropDuster;

    }
}
