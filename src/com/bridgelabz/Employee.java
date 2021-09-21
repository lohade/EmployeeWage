package com.bridgelabz;

public class Employee {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Welcome to the employee wage compute:");
        int a=(int)Math.floor(Math.random()*10) %2;
        if (a == 1) {
            System.out.println("Employee is present");
        }
        else {
            System.out.println("employee is absent");
        }
    }
}

