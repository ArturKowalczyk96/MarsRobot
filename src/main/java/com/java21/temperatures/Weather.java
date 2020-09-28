package com.java21.temperatures;

public class Weather {
    public static void main(String[] args){
        float fah = 86;
        System.out.println(fah + " Fahrenheit degrees is ");
        //convert Fahrenheit to Celsius
        fah = fah - 32;
        fah = fah / 9;
        fah = fah * 5;
        System.out.println(fah + " Celsius degrees\n");

        float cel = 33;
        System.out.println(cel + " Celsius degrees is ");
        //convert Celsius to Fahrenheit
        cel = cel * 9;
        cel = cel / 5;
        cel = cel + 32;
        System.out.println(cel + " Fahrenheit degrees");
    }
}
