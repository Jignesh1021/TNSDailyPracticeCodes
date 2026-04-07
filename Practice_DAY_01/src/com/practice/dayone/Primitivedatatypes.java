package com.practice.dayone;

public class Primitivedatatypes {

    public static void main(String[] args) {

        // byte = 1 byte
        byte byteMax = 127;
        byte byteMin = -128;
        System.out.println("Byte -> Min: " + byteMin + " Max: " + byteMax);

        // short = 2 bytes
        short shortMax = 32767;
        short shortMin = -32768;
        System.out.println("Short -> Min: " + shortMin + " Max: " + shortMax);

        // int = 4 bytes
        int minInt = -2147483648;
        int maxInt = 2147483647;
        System.out.println("Int -> Min: " + minInt + " Max: " + maxInt);

        // long = 8 bytes
        long maxLong = 9223372036854775807L;
        long minLong = -9223372036854775808L;
        System.out.println("Long -> Min: " + minLong + " Max: " + maxLong);
    }
}