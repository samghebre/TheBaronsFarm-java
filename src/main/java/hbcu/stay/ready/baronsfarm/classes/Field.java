package hbcu.stay.ready.baronsfarm.classes;

import java.util.ArrayList;
import java.util.Collections;

public class Field extends Farm {
    public Field() {

    }
    ArrayList<CropRow> cropRowArrayList;
    private CropRow cropRow = new CropRow();

    public Field(String cropRow, Object crop){
        super(cropRow,crop);

        cropRowArrayList = new ArrayList<>();
    }
    public void addCropRow(CropRow cropRow){
        Collections.addAll(cropRowArrayList,cropRow);

    }

    public void getCropRow(){
        cropRowArrayList.toString();
    }

    public void addCropRow(CropRow cropRow, CropRow cropRow1, CropRow cropRow2) {
        Collections.addAll(cropRowArrayList,cropRow);
    }
}
