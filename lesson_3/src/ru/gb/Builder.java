package ru.gb;

public interface Builder {
    void setModel(String model);
    void setColor(String color);
    void setMaxSpeed(int maxSpeed);
    void setPrice(long price);

//    CarBuilder model(String model) {
//        return this;
//    }
//
//    CarBuilder maxSpeed(int maxSpeed) {
//        return this;
//    }
//
//    CarBuilder color(String color) {
//        return this;
//    }
//
//    CarBuilder price(long price) {
//        return this;
//    }
}
