package hbcu.stay.ready.baronsfarm.abstracts;

import hbcu.stay.ready.baronsfarm.classes.Edible;
import hbcu.stay.ready.baronsfarm.classes.EdibleEgg;

public abstract class Produce implements Edible {

   private Edible produce;
   boolean hasBeenFertilized = false;

   public Produce(Edible edible){
      this.produce = edible;
   }
   public Edible yield() {
      if (hasBeenFertilized) {
         return produce.yield();
      }
      return null;
   }

   public Edible getProduce() {
      return produce;
   }

   public void setProduce(Edible produce) {
      this.produce = produce;
   }
   public Produce(){}

   public boolean hasBeenFertilized() {
      return hasBeenFertilized;
   }

   public void setHasBeenFertilized(boolean hasBeenFertilized) {
      this.hasBeenFertilized = hasBeenFertilized;
   }
}
