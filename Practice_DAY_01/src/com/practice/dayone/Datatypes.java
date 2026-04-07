package com.practice.dayone;

public class Datatypes {

    public static void main(String[] args) {

        // Integer division
        int value1 = 7 / 3;
        System.out.println("Integer division (7/3): " + value1);

        // Float division
        float value2 = 101f / 61f;
        System.out.println("Float division: " + value2);

        // Double division
        double value3 = 101d / 61d;
        System.out.println("Double division: " + value3);

        // Area of circle
        int radius = 1450;
        double area = 3.14 * radius * radius;
        System.out.println("Area of circle: " + area);

        // Long data type
        long phoneNo = 7756956456L;
        System.out.println("Phone Number: " + phoneNo);

        // Type casting (IMPORTANT )
        double num = 10.75;
        int converted = (int) num;
        System.out.println("Type Casting (double to int): " + converted);

        // Character and ASCII
        char ch = 'A';
        int ascii = ch;
        System.out.println("Character: " + ch + " ASCII value: " + ascii);

        // Boolean
        boolean isJavaFun = true;
        System.out.println("Is Java Fun? " + isJavaFun);

        // Increment & Decrement
        int x = 5;
        x++;
        System.out.println("After increment: " + x);

        x--;
        System.out.println("After decrement: " + x);
    }
}