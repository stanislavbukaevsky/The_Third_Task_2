public class Car extends Bicycle {

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку на легковом автомобиле");
    }

    public static void checkEngine() {
        System.out.println("Проверяем двигатель на легковом автомобиле");
    }
}
