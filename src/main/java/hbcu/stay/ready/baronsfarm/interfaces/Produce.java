package hbcu.stay.ready.baronsfarm.interfaces;

import hbcu.stay.ready.baronsfarm.classes.Edible;
import hbcu.stay.ready.baronsfarm.classes.EdibleEgg;

public interface Produce {


   String yield = null;
   String harvest = null;
   String fertilize = null;
   boolean hasBeenHarvested = false;
   boolean hasBeenFertilized = false;

   EdibleEgg eat();
   Edible yield();
   void harvest();
   void fertilize();

   void getFertilize();
}
