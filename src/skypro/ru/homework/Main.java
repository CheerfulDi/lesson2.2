package skypro.ru.homework;

public class Main {
    public static void main(String[] args) {
//        Car[] cars = {
//                new Car("Kia", 4),
//                new Car("BMW", 4)
//        };
//
//        Truck[] trucks = {
//                new Truck("Hyundai", 6),
//                new Truck("Volvo", 8)
//        };
//
//        Bicycle[] bicycles = {
//                new Bicycle("Trek", 2),
//                new Bicycle("Aist", 2)
//        };

        Vehicle[] vehicles = {
                new Car("Kia", 4),
                new Car("BMW", 4),

                new Truck("Hyundai", 6),
                new Truck("Volvo", 8),

                new Bicycle("Trek", 2),
                new Bicycle("Aist", 2)
        };

//        Vehicle[] vehicles = new Vehicle[cars.length + trucks.length + bicycles.length];
//        System.arraycopy(cars, 0, vehicles, 0, cars.length);
//        for (Truck truck : trucks) {
//            vehicles[cars.length + 1] = truck;
//        }
//        for (Bicycle bicycle : bicycles) {
//            vehicles[cars.length + trucks.length + 1] = bicycle;
//        }

        System.out.println("На сервисном обслуживании: " + vehicles.length + " транспортных средств.");
        System.out.println();

        ServiceStation station = new ServiceStation();
        checkVehicles(station, vehicles);


    }
//    public static void checkVehicles(Service station, Vehicle[] vehicles){
//        station.check(cars);
//        station.check(trucks);
//        station.check(bicycles);
//    }

    public static void checkVehicles(Service station, Vehicle[] vehicle){
        station.check(vehicle);

    }
}
