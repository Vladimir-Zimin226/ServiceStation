public class Bicycle extends Vehicle implements UpdatingTyres {

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        UpdatingTyres.super.updateTyre();
    }
}
