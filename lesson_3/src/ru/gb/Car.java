package ru.gb;

public class Car {
    private String model;
    private String color;
    private int maxSpeed;
    private long price;

    public Car(String model, String color, int maxSpeed, long price) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", price=" + price +
                '}';
    }
}
