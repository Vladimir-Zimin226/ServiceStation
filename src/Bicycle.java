public class Bicycle extends Vehicle implements UpdatingTyres {
       @Override
       public void updateTyre() {
              UpdatingTyres.super.updateTyre();
       }
}
