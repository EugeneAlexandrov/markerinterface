package com.mybclym;

public class CustomMarkerInterfaceExample extends A implements Marker {
    public static void main(String[] args) {
        CustomMarkerInterfaceExample a = new CustomMarkerInterfaceExample();
        try {
            a.m1();
        } catch (MyException e) {
            System.out.println(e);
        }
    }
}
