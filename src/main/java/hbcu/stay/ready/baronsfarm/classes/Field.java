package hbcu.stay.ready.baronsfarm.classes;

import java.util.ArrayList;

public class Field extends Farm {
    ArrayList<CropRow> cropRows;
    public Field() {

        ArrayList<CornStalk> cornStalks = new ArrayList<>();
        cornStalks.add(new CornStalk(new EarCorn()));
        ArrayList<TomatoPlant> tomatoPlants = new ArrayList<>();
        tomatoPlants.add(new TomatoPlant(new Tomato()));

      CropRow<CornStalk> cornRow = new CropRow<>(cornStalks);
      CropRow<TomatoPlant> tomatoRow = new CropRow<>(tomatoPlants);

      cropRows = new ArrayList<>();
      cropRows.add(cornRow);
      cropRows.add(tomatoRow);


    }

}
