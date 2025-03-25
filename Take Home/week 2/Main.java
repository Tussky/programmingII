public class Main {
    public static void main(String[] args) {
        Car my_car = new Car("Lamborghini", "Hurucan", 2019, false, 0);
        my_car.start();
        my_car.accelerate();
        my_car.brake();
        my_car.brake();
        my_car.stop();
        my_car.DisplayInfo();
    }
}
