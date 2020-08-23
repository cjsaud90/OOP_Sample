package com.company.basicPackage.package2;

public class Cicle {
    final double PI = 3.14;
    double rad ;

    public void setRad(double rad){
        this.rad = rad;
    }

    public double getPerimeter(){
        return (rad*2)*PI;
    }

}
