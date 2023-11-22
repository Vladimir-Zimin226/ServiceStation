public class Car extends Vehicle implements CheckingEngines {
    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public void updateTyre() {
        CheckingEngines.super.updateTyre();
    }
}
