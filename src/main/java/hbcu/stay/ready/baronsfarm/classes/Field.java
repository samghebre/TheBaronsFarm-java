package hbcu.stay.ready.baronsfarm.classes;

import hbcu.stay.ready.baronsfarm.abstracts.Crop;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Field extends Farm {
    ArrayList<CropRow> cropRows;
    public Field() {

        ArrayList<Crop> tomatoPlants = new ArrayList<>();
        ArrayList<Crop> cornStalks = new ArrayList<Tomato>();
        CropRow tomatoRow = new CropRow(tomatoPlants);
      cropRows = new ArrayList<>();
      cropRows.add( new CropRow(new ArrayList<>()));

    }

}
