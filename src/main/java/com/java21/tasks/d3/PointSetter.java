package com.java21.tasks.d3;

import java.awt.*;

public class PointSetter {
    public static void main(String[] arguments) {
        Point location = new Point(4, 13);

        System.out.println("Starting point:");
        System.out.println("X equals " + location.x);
        System.out.println("Y equals " + location.y);

        System.out.println("\nChange for (7, 6)");
        location.x = 7;
        location.y = 6;

        System.out.println("\nEnding point:");
        System.out.println("X equals " + location.x);
        System.out.println("Y equals " + location.y);
    }
}
