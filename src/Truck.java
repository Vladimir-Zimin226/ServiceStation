public class Truck extends Vehicle implements CheckingTrailers {

    @Override
    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    @Override
    public void updateTyre() {
        CheckingTrailers.super.updateTyre();
    }

    @Override
    public void checkEngine() {

    }
}
