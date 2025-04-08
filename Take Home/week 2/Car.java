public class Car {
    String make;
    String model;
    int year;
    boolean engineOn;
    int speed;

    public Car(){
        this.make = "unknown";
        this.model = "model unknown";
        this.year = 0;
        engineOn = false;
        speed = 0;
    }

    public Car(String car_make, String car_model, int car_year){
        this.make = car_make;
        this.model = car_model;
        this.year = car_year;
        engineOn = false;
        speed = 0;
    }

    public Car( String car_make, String car_model, int car_year, boolean engine_val, int car_speed){
        this.make = car_make;
        this.model = car_model;
        this.year = car_year;
        engineOn = engine_val;
        this.speed = car_speed;
    }

    public void DisplayInfo(){
        System.out.println("The car make is: " + this.make);
        System.out.println("The car model is: " + this.model);
        System.out.println("The car was made in: " + this.year);

        if (engineOn){
            System.out.println("The engine is : on, the car speed is: "+this.speed);
        } else {
            System.out.println("The engine is off. The speed is: "+this.speed);
        }
    }

    public void start(){
        this.engineOn = true;
        System.out.println("The car is on");
    }

    public void accelerate(){
        if (this.engineOn){
            speed += 50;
            System.out.println("The car has accelerated, the new speed is: "+this.speed);
        } else {
            System.out.println("The car cannot accelerate as it is not turned on.");
        }
    }

    public void brake(){
        if (this.speed >= 25){
            speed -= 25;
            System.out.println("The brakes have been applied, new speed: "+this.speed);
        } else {
            System.out.println("The car is not going fast enough to brake");
        }
    }

    public void stop(){
        if (this.speed == 0){
            this.engineOn = false;
        } else {
            System.out.println("The car cannot be stopped as it is still moving!");
        }
    }

}
