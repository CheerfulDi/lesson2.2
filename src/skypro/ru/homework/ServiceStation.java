package skypro.ru.homework;

public class ServiceStation implements Service {

    @Override
    public void check(Car[] cars){
        if (cars.length != 0) {
            for (Car car : cars) {
                System.out.println();
                System.out.println("Обслуживаем автомобиль " + car.getModelName());
                for (int j = 0; j < car.getWheelsCount(); j++) {
                    car.updateTyre();
                }
                car.checkEngine();
            }
        }
    }

    @Override
    public void check(Truck[] trucks){
        if (trucks.length != 0) {
            for (Truck truck : trucks) {
                System.out.println();
                System.out.println("Обслуживаем грузовик " + truck.getModelName());
                for (int j = 0; j < truck.getWheelsCount(); j++) {
                    truck.updateTyre();
                }
                truck.checkEngine();
                truck.checkTrailer();
            }
        }
    }

    @Override
    public void check(Bicycle[] bicycles) {
        if (bicycles.length != 0) {
            for (Bicycle bicycle : bicycles) {
                System.out.println();
                System.out.println("Обслуживаем велосипед " + bicycle.getModelName());
                for (int j = 0; j < bicycle.getWheelsCount(); j++) {
                    bicycle.updateTyre();
                }
            }
        }
    }

}
