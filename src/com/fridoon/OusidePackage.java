package com.fridoon;
import genel.fridoon.SecondClass;


public class OusidePackage {
    public static void main(String[] args) {
        SecondClass s= new SecondClass();
        s.Smileo();
//        s.Smile(); becuase it is protected
    }

}
