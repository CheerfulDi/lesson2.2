package skypro.ru.homework;

public class Bicycle extends Vehicle {

   public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
        }


    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }
}
