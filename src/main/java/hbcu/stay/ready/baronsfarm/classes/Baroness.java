package hbcu.stay.ready.baronsfarm.classes;

public class Baroness extends Pilot{

    private static Baroness instance;

    private Baroness(String name, String noise, long id) {
        super(name, noise, id);
    }
    public Baroness getInstance(){
        return instance;
    }

    public String eatBaroness(Edible edible) {
        return "Yum eggs and sweet corn!";
    }
    public CropDuster ride(CropDuster cropDuster){
        return cropDuster;

    }

}
