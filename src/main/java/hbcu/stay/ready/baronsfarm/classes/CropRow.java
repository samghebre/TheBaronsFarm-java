package hbcu.stay.ready.baronsfarm.classes;

import java.util.ArrayList;

public class CropRow extends Field{
    ArrayList<String> cropList;
    boolean hasBeenFertilized = false;
    public CropRow(){
        cropList = new ArrayList<String>();
    }
    public boolean hasBeenFertilized(){
        if(this.hasBeenFertilized){
            return true;
        }else{
            return false;
        }
    }

    public void fertilize(){
        this.hasBeenFertilized = true;
    }
}
