package ru.gb;

public class CarBuilder implements Builder{
    private String model;
    private int maxSpeed;
    private String color;
    private long price;

    @Override
    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void setPrice(long price) {
        this.price = price;
    }

    public Car build() {
        return new Car(model, color, maxSpeed, price);
    }
}
