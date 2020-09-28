package com.java21.tasks.d2.t1;

public class InvestmentCalculation {
    public static void main(String[] args){
        double deposit = 14000;
        //year 1
        deposit = deposit *1.4;
        //year 2
        deposit = deposit - 1500;
        //year 3
        deposit = deposit *1.12;
        System.out.println("Value of investment after 3 years: " + deposit);
    }
}
