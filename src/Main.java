public class Main {
    public static void main(String[] args) {
        Car toyota = new Car("Toyota", 4);
        Vehicle mazda = new Car("Mazda", 4);
        Vehicle specialized = new Bicycle("Specialized", 2);
        Vehicle merida = new Bicycle("Merida", 2);
        Vehicle kamaz = new Truck("Kamaz", 6);
        Vehicle shacman = new Truck("Shacman", 8);

        Vehicle[] vehicles = {
                toyota,
                mazda,
                specialized,
                merida,
                kamaz,
                shacman
        };


        ServiceStation station = new ServiceStation();
        for (Vehicle vehicle : vehicles) {
            station.check(vehicle);
        }
    }
}