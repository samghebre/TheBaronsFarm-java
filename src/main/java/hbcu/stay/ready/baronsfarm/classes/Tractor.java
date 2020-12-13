package hbcu.stay.ready.baronsfarm.classes;

import hbcu.stay.ready.baronsfarm.interfaces.FarmVehicle;
import hbcu.stay.ready.baronsfarm.interfaces.NoiseMaker;
import hbcu.stay.ready.baronsfarm.interfaces.Rideable;

public class Tractor implements Rideable, NoiseMaker, FarmVehicle {


    public Tractor(String harvest){
        super();
    }

    @Override
    public String makeNoise() {
        return "chug chug chug";
    }

    @Override
    public int ride() {
        return 0;
    }

    @Override
    public void operate(Farm farm) {

    }
}
