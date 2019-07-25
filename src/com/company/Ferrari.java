package com.company;

public class Ferrari extends Car {
    public Ferrari(String carName, Wheel wheel, Steering_Wheel steering_wheel) {
        super(carName, wheel, steering_wheel);
    }

    public Ferrari(int wheel, int steering_wheel, String carName) {
        super(wheel, steering_wheel, carName);
    }

    
}
