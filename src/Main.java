public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        Car car2 = new Car();
        car.setModelName("BMW");
        car2.setModelName("ВАЗ");
        car.setWheelsCount(4);
        car2.setWheelsCount(4);

        Truck truck = new Truck();
        Truck truck2 = new Truck();
        truck.setModelName("Газель");
        truck2.setModelName("Mercedes");
        truck.setWheelsCount(6);
        truck2.setWheelsCount(8);

        Bicycle bicycle = new Bicycle();
        Bicycle bicycle2 = new Bicycle();
        bicycle.setModelName("Аист");
        bicycle2.setModelName("Салют");
        bicycle.setWheelsCount(2);
        bicycle2.setWheelsCount(2);

        ServiceStation station = new ServiceStation();
        station.check(car2);
        station.check(bicycle);
        station.check(truck2);

    }


}