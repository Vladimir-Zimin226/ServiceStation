public class Car extends Vehicle {

    public Car(String modelName, int wheelsCount) {
        super(modelName, 4);
    }

    @Override
    public void service() {
        super.service();
        checkEngine();
    }
}
