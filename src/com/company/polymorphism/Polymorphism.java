package com.company.polymorphism;

abstract class Calc{

    int a = 4;
    int b = 3;

    abstract  void plus();

}

class MyCalc extends Calc{

    @Override
    void plus() {
        System.out.println(a+b);
    }

    void mins(){
        System.out.println(a-b);
    }
}

public class Polymorphism {

    public static void main(String[] args) {
        MyCalc myCalc = new MyCalc();
        myCalc.plus();
        myCalc.mins();
    }
}
