package com.company.polymorphism;


interface Printable{
    void print(String doc);
}

class PrnDrvSam implements Printable{

    @Override
    public void print(String doc) {
        System.out.println("SAM "+doc);
    }
}



public class PolymorphismTest {
}
