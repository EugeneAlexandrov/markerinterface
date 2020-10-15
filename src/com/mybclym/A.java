package com.mybclym;

class A {
    void m1() throws MyException {
        if ((this instanceof Marker)) {
            System.out.println("successfull");
        } else {
            throw new MyException("Must implement interface Marker ");
        }
    }
}

class MyException extends Exception {
    public MyException(String s) {
        super(s);
    }
}
