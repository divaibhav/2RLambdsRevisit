/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Nov-20
 *  Time: 11:23 AM
 */
package main;

import myinterface.MyFunctionalInterface;

public class MyMain {
    public static void main(String[] args) {
        // defining behaviour of my functional interface
        //by writing lambda expression
        MyFunctionalInterface add = (no1, no2) -> {
           return no1 +no2;
        };
        MyFunctionalInterface sub = (no1, no2) -> no1 - no2;
        //calling lambda expression
        System.out.println("addition of 50, 70 is = " + add.operation(50,70));
        System.out.println("subtraction of 50, 70 is = " + sub.operation(50,70));
    }
}
