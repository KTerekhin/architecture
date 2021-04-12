package ru.gb;

public class App {

    public static void main(String[] args) {
        createNewCar();
    }

    public static void createNewCar() {
        CarBuilder carBuilder = new CarBuilder();
        carBuilder.setModel("Bugatti Veyron");
        carBuilder.setColor("Black");
        carBuilder.setMaxSpeed(400);
        carBuilder.setPrice(2280000);
        Car car = carBuilder.build();
    }
}
