package com.company.overloading;


class Calc {
    int add(int a, int b){
        return a+b;
    }

    int add(int a){
        return a+1;
    }

    double add (double a , double b){
        return a+b;
    }
}

public class Calculation {

    public static void main(String[]args){

        Calc cacl = new Calc();
        int result1 = cacl.add(3,9);
        int result2 = cacl.add(3);
        double result3 = cacl.add(3.4, 52.4);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);


    }

}
