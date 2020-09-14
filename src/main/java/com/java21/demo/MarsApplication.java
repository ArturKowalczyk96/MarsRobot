package com.java21.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MarsApplication {

    public static void main(String[] args) {
        SpringApplication.run(MarsApplication.class, args);
        MarsRobot spirit = new MarsRobot();
        spirit.status = "\nExploration";
        spirit.speed = 2;
        spirit.temperature = -60;

        spirit.showAttributes();
        System.out.println("\nChange spped to 3");
        spirit.speed = 3;
        spirit.showAttributes();
        System.out.println("\nChange temperature to -90");
        spirit.temperature = -90;
        spirit.showAttributes();
        System.out.println("\nCheck temperature");
        spirit.checkTemperature();
        spirit.showAttributes();
    }

}
