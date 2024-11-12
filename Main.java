

public class Main {

    public static void main(String[] args) {

        Car myCar = new Car("Fusca");
        myCar.run();

    }
}


class Car {
    String model;

    public Car(String model){
        this.model = model;
    }

    public void run(){
        System.out.println("Car is running");
    }
}