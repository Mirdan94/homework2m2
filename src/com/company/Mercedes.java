package com.company;

public class Mercedes extends Car {

    public Mercedes(String carName, Wheel wheel, Steering_Wheel steering_wheel) {
        super(carName, wheel, steering_wheel);
    }

    public Mercedes (int wheel, int steering_wheel, String carName) {

        super (wheel, steering_wheel, carName);
    }


}
