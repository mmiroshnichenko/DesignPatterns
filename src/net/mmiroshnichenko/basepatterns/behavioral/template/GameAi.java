package net.mmiroshnichenko.basepatterns.behavioral.template;

public abstract class GameAi {

   protected abstract void buildStructures();
   protected abstract void buildUnits();

   public void turn() {
       collectResources();
       buildStructures();
       buildUnits();
       attack();
   }

   private void collectResources() {
       System.out.println("Collect resources");
   }

   private void attack() {
       System.out.println("Attack by all units");
   }
}
