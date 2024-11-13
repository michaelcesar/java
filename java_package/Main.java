package java_package;

public class Main {

    public static void main(String[] args) {

        Car myCar = new Car("Fusca");
        myCar.run();

        String text = myCar.run();

        System.out.println(text);

    }
}


class Car {
    String model;

    public Car(String model){
        this.model = model;
    }

    public String run(){
        System.out.println("The "+ this.model + " is running");

        return "return";
    }
}