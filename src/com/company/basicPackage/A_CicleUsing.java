package com.company.basicPackage;


import com.company.basicPackage.package2.Cicle;

public class A_CicleUsing {

    public static void main(String[] args) {
        com.company.basicPackage.package1.Cicle cicle1 = new com.company.basicPackage.package1.Cicle();
        Cicle cicle2 = new Cicle();

        cicle1.setRad(3.5);
        cicle2.setRad(41.2);

        System.out.println(cicle1.getArea());
        System.out.println(cicle2.getPerimeter());

    }
}
