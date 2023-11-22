public class Car extends Vehicle implements CheckingEngines {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public void updateTyre() {
        CheckingEngines.super.updateTyre();
    }
}
