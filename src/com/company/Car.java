package com.company;

public abstract class Car {

    private String carName;

    private Wheel wheel;

    private Steering_Wheel steering_wheel;

    public Car (String carName, Wheel wheel, Steering_Wheel steering_wheel) {

        this.carName = carName;
        this.wheel = wheel;
        this.steering_wheel = steering_wheel;
    }

    public Car(int wheel, int steering_wheel, String carName) {

    }
}
