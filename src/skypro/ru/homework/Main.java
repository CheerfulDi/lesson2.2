package skypro.ru.homework;

public class Main {
    public static void main(String[] args) {
        Car[] cars = {
                new Car("Kia", 4),
                new Car("BMW", 4)
        };

        Truck[] trucks = {
                new Truck("Hyundai", 6),
                new Truck("Volvo", 8)
        };

        Bicycle[] bicycles = {
                new Bicycle("Trek", 2),
                new Bicycle("Aist", 2)
        };

        Vehicle[] vehicles = new Vehicle[cars.length + trucks.length + bicycles.length];
        for (int i = 0; i < cars.length; i++) {
            vehicles[i] = cars[i];
        }
        for (Truck truck : trucks) {
            vehicles[cars.length + 1] = truck;
        }
        for (Bicycle bicycle : bicycles) {
            vehicles[cars.length + trucks.length + 1] = bicycle;
        }

        System.out.println("На сервисном обслуживании: " + vehicles.length + " транспортных средств.");
        System.out.println();

        ServiceStation station = new ServiceStation();
        checkVehicles(station, cars, trucks, bicycles);


    }
    public static void checkVehicles(Service station, Car[] cars, Truck[] trucks, Bicycle[] bicycles){
        station.check(cars);
        station.check(trucks);
        station.check(bicycles);
    }
}
