package com.java21.demo;

public class MarsRobot {
    String status;
    int speed;
    float temperature;

    void checkTemperature() {
        if (temperature < -62){
            status = "Back to home";
            speed = 5;
        }
    }
    void showAttributes(){
        System.out.println("Status: " + status);
        System.out.println("Speed: " + speed);
        System.out.println("Temperature: " + temperature);
    }
}
